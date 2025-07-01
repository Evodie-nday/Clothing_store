package org.devkiki.ecommerce.e_commerce.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class CategoryDto {

    private Long id;
    @NotBlank
    private String name;
    private String description;
    @NotBlank
    private String slug;
    private String imageUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
