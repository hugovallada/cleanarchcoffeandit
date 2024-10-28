package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public record PaymentDto(
        @JsonProperty("id")
        UUID id,
        OrderDto orderDto,
        Double amount,
        String currency,
        LocalDateTime paymentDate,
        String paymentMethod,
        Status status
) {

}
