package com.yisus.ejemplo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@Document(collection = "orders")
@Valid
public class Order {
    @Id
    private String idOrder;
    private OrderDetail orderDetail;
    private DeliveryDetail deliveryDetail;

    @Valid
    @NotNull(message = "Must not be empty")
    @JsonProperty("customer")
    private Customer customer;
}
