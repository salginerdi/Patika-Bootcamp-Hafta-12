package dev.patika.library.dto.request.bookBorrowing;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingUpdateRequest {
    @Positive
    private long id;
    @NotNull
    private String borrowerName;
    @Email
    private String borrowerMail;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
}
