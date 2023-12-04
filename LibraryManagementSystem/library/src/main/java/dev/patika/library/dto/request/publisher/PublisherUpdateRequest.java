package dev.patika.library.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class PublisherUpdateRequest {
    @Positive
    private long id;
    @NotNull
    private String name;
    private int establishmentYear;
    private String address;
}
