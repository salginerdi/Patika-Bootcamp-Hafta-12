package dev.patika.library.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CategoryUpdateRequest {
    @Positive
    private long id;
    @NotNull
    private String name;
    private String description;
    private long bookId;
}
