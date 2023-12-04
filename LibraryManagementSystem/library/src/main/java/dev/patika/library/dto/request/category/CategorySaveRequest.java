package dev.patika.library.dto.request.category;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategorySaveRequest {
    @NotNull
    private String name;
    private String description;
}
