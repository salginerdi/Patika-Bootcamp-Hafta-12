package dev.patika.library.dto.request.book;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class BookUpdateRequest {
    @Positive
    private long id;
    @NotNull
    private String name;
    private int publicationYear;
    private int stock;
    private long authorId;
    private long publisherId;
    private long categoryId;
}
