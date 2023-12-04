package dev.patika.library.dto.request.author;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {
    @Positive(message = "ID değeri pozitif sayı olmak zorundadır!")
    private long id;

    @NotNull(message = "Yazar adı boş veya null olamaz!")
    private String name;

    private LocalDate birthDate;

    private String country;
}
