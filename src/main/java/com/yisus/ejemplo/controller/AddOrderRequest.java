package com.yisus.ejemplo.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yisus.ejemplo.model.Order;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Service
public class AddOrderRequest {
    @Valid
    @NotNull(message = "Must not be empty")
    @JsonProperty("order")
    private Order order;
}
