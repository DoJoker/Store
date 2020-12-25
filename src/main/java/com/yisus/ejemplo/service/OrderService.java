package com.yisus.ejemplo.service;

import com.yisus.ejemplo.controller.AddOrderRequest;
import com.yisus.ejemplo.controller.AddOrderResponse;
import com.yisus.ejemplo.controller.UpdateOrderResponse;

import java.util.List;


public interface OrderService {

    List<Order> getOrders();

    AddOrderResponse addOrder(AddOrderRequest request);

    UpdateOrderResponse updateOrder(AddOrderRequest request);


}
