package dev.patika.library.dto.response.author;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorResponse {
    private long id;
    private String name;
    private LocalDate birthDate;
    private String country;
}
