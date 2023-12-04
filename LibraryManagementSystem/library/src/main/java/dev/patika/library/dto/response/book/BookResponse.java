package dev.patika.library.dto.response.book;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private Long id;
    private String name;
    private int publicationYear;
    private int stock;
    private long authorId;
    private long publisherId;
    private long categoryId;
}
