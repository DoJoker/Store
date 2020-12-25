package com.yisus.ejemplo.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String idOrder;
    private OrderDetail orderDetail;
    private DeliveryDetail deliveryDetail;
}
