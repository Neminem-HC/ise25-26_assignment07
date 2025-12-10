package de.seuhd.campuscoffee.api.dtos;

import lombok.Builder;

import java.time.LocalDateTime;

import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NonNull;

import jakarta.validation.constraints.NotBlank;
/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto(
        @Nullable Long id,
        @Nullable LocalDateTime createdAt,
        @Nullable LocalDateTime updatedAt,
        @NonNull Long posId,
        @NonNull Long authorId,

        @NotBlank(message = "Review cannot be empty.")
        @NonNull String review,

         Boolean approved

) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
