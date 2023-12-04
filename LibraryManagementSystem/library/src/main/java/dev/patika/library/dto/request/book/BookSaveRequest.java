package dev.patika.library.dto.request.book;

import dev.patika.library.entities.BookBorrowing;
import dev.patika.library.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {
    private String name;
    private int publicationYear;
    private int stock;
    private long authorId;
    private long publisherId;
    private long categoryId;
}
