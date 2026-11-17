package com.todobarato.pcl.todobarato.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarcaRequestDTO {
    @Schema(description = "Nombre de la marca", example = "Toyota")
    @NotBlank(message = "El nombre del área es obligatorio")
    @Size(max = 200, message = "El nombre no puede superar los 200 caracteres")
    private String nombre;
    @Schema(description = "Estado de la marca (activo/inactivo)", example = "true")
    @Builder.Default
    private Boolean estado = true;
    @Schema(description = "Precio de la marca", example = "20000")
    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.00", inclusive = false, message = "El precio debe ser mayor que cero")
    private BigDecimal precio;
    @Schema(description = "Cantidad de la marca", example = "1")
    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad debe ser al menos 1")
    private Integer cantidad;
    @Schema(description = "Total registrado para la marca", example = "20000.00")
    @NotNull(message = "El total es obligatorio")
    @DecimalMin(value = "0.00", message = "El total no puede ser negativo")
    private BigDecimal total;
}
