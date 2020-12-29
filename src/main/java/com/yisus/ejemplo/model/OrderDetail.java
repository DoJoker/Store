package com.yisus.ejemplo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderDetail {
    private List<Product> productList;
    private List<Extra> extras;
    private List<Discount> discounts;
    @JsonProperty("total")
    private double total;
    @JsonProperty("subtotal")
    private double subtotal;
}
