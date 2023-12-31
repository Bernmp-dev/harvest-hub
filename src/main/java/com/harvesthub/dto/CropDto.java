package com.harvesthub.dto;

import com.harvesthub.models.entities.Crop;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;


/** Crop Data Tranfer Object. */
public record CropDto(
        @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Crop's id", example = "1")
        Long id,
        @Schema(
          accessMode = Schema.AccessMode.READ_ONLY,
          description = "Crop's farm id",
          example = "1"
        )
        Long farmId,
        @NotBlank(message = "Nome não pode ser nulo ou vazio!")
        @Schema(description = "Crop's name", example = "Soja")
        String name,
        @Min(value = 0, message = "Área plantada não pode ser nula ou menor que 0!")
        @Schema(description = "Crop's planted area", example = "100.0")
        Double plantedArea,
        @NotNull(message = "Data de plantio não pode ser nula!")
        @PastOrPresent(message = "Data de plantio não pode ser no futuro!")
        @Schema(description = "Crop's planted date", example = "2021-01-01")
        LocalDate plantedDate,
        @NotNull(message = "Data de colheita não pode ser nula!")
        @PastOrPresent(message = "Data de colheita não pode ser no futuro!")
        @Schema(description = "Crop's harvest date", example = "2021-01-01")
        LocalDate harvestDate
) {

  /**
   * Converts CropDto to Crop entity.

   * @return Crop entity.
   */
  public Crop toEntity() {
    return new Crop(
            name,
            plantedArea,
            plantedDate,
            harvestDate
    );
  }
}