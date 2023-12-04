package dev.patika.library.dto.response.bookBorrowing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingResponse {
    private long id;
    private String borrowerName;
    private LocalDate borrowingDate;
    private long bookId;
}
