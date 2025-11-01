package com.tecsup.order_service.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;

@Data
public class CreateOrderRequest {

    @NotNull(message = "El ID de usuario no puede ser nulo")
    private Long userId;

    @Valid
    @NotEmpty(message = "La orden debe tener al menos un ítem")
    private List<CreateOrderItemRequest> items;
}