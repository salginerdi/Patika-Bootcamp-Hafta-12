package dev.patika.library.api;

import dev.patika.library.business.abstracts.IBookBorrowingService;
import dev.patika.library.business.abstracts.IBookService;
import dev.patika.library.core.config.modelMapper.IModelMapperService;
import dev.patika.library.core.result.Result;
import dev.patika.library.core.result.ResultData;
import dev.patika.library.core.utilies.ResultHelper;
import dev.patika.library.dto.request.bookBorrowing.BookBorrowingSaveRequest;
import dev.patika.library.dto.request.bookBorrowing.BookBorrowingUpdateRequest;
import dev.patika.library.dto.response.CursorResponse;
import dev.patika.library.dto.response.book.BookResponse;
import dev.patika.library.dto.response.bookBorrowing.BookBorrowingResponse;
import dev.patika.library.entities.Author;
import dev.patika.library.entities.Book;
import dev.patika.library.entities.BookBorrowing;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookborrowings")
public class BookBorrowingController {
    private final IBookBorrowingService bookBorrowingService;
    private final IModelMapperService modelMapper;
    private final IBookService bookService;

    public BookBorrowingController(IBookBorrowingService bookBorrowingService,
                                   IModelMapperService modelMapper,
                                   IBookService bookService) {
        this.bookBorrowingService = bookBorrowingService;
        this.modelMapper = modelMapper;
        this.bookService = bookService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<BookBorrowingResponse> save(@Valid @RequestBody BookBorrowingSaveRequest bookBorrowingSaveRequest) {
        BookBorrowing saveBookBorrowing = this.modelMapper.forRequest().map(bookBorrowingSaveRequest, BookBorrowing.class);

        Book book = this.bookService.get(bookBorrowingSaveRequest.getBookId());

        // Stok kontrolü
        if (book.getStock() > 0) { // Eğer stokta kitap varsa ödünç verme işlemi yapılır
            saveBookBorrowing.setBook(book);
            this.bookBorrowingService.save(saveBookBorrowing);

            // Stoktan bir kitap düşülür
            book.setStock(book.getStock() - 1);
            this.bookService.update(book); // Kitap stok miktarını güncelle

            return ResultHelper.created(this.modelMapper.forResponse().map(saveBookBorrowing, BookBorrowingResponse.class));
        } else {
            // Stokta kitap yoksa hata mesajı döndürülür
            return ResultHelper.failure(HttpStatus.BAD_REQUEST, "Stokta bu kitaptan kalmamış.");
        }
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookBorrowingResponse> get(@PathVariable("id") int id) {
        BookBorrowing bookBorrowing = this.bookBorrowingService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(bookBorrowing, BookBorrowingResponse.class));
    }

    @GetMapping("/{id}/book")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> getBook(@PathVariable("id") int id) {
        BookBorrowing bookBorrowing = this.bookBorrowingService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(bookBorrowing.getBook(), BookResponse.class));
    }

    // Listeleme işlemi
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<BookBorrowingResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ) {
        Page<BookBorrowing> bookBorrowingPage = this.bookBorrowingService.cursor(page, pageSize);
        Page<BookBorrowingResponse> bookBorrowingResponsePage = bookBorrowingPage
                .map(bookBorrowing -> this.modelMapper.forResponse().map(bookBorrowing, BookBorrowingResponse.class));
        return ResultHelper.cursor(bookBorrowingResponsePage);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookBorrowingResponse> update(@Valid @RequestBody BookBorrowingUpdateRequest bookBorrowingUpdateRequest) {
        BookBorrowing updateBookBorrowing = this.modelMapper.forRequest().map(bookBorrowingUpdateRequest, BookBorrowing.class);
        this.bookBorrowingService.update(updateBookBorrowing);
        return ResultHelper.success(this.modelMapper.forResponse().map(updateBookBorrowing, BookBorrowingResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") int id) {
        this.bookBorrowingService.delete(id);
        return ResultHelper.ok();
    }
}
