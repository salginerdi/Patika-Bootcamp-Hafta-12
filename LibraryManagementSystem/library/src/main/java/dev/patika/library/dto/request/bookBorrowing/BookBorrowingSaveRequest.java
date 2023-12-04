package dev.patika.library.dto.request.bookBorrowing;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveRequest {
    @NotNull
    private String borrowerName;
    @Email
    private String borrowerMail;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private long bookId;
}
