package dev.patika.library.dto.request.publisher;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class PublisherSaveRequest {
    @NotNull
    private String name;
    private int establishmentYear;
    private String address;
}
