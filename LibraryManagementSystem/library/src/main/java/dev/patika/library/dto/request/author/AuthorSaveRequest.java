package dev.patika.library.dto.request.author;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorSaveRequest {

    @NotNull(message = "Yazar adı boş veya null olamaz!")
    private String name;

    private LocalDate birthDate;

    private String country;
}
