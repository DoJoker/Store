package com.yisus.ejemplo.service;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderDetail {
    private List<Product> productList;
    private List<Double> extra;
    private List<Double> discounts;
    private double total;
    private double subtotal;
}
