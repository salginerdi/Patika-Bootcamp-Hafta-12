package dev.patika.library.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowings")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "borrower_name", nullable = false)
    private String borrowerName;

    @Column(name = "borrower_mail", nullable = false)
    private String borrowerMail;

    @Column(name = "borrowing_date", nullable = false)
    private LocalDate borrowingDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Book book;

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowerMail='" + borrowerMail + '\'' +
                ", borrowingDate=" + borrowingDate +
                ", returnDate=" + returnDate +
                ", book=" + book +
                '}';
    }
}
