package com.yisus.ejemplo.service;

import com.yisus.ejemplo.controller.AddOrderRequest;
import com.yisus.ejemplo.controller.UpdateOrderResponse;
import com.yisus.ejemplo.model.Order;

import java.util.List;


public interface OrderService {

    List<Order> getOrders();

    boolean addOrder(AddOrderRequest request);

    UpdateOrderResponse updateOrder(AddOrderRequest request);


}
