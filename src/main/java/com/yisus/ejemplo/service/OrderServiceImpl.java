package com.yisus.ejemplo.service;

import com.yisus.ejemplo.controller.AddOrderRequest;
import com.yisus.ejemplo.controller.UpdateOrderResponse;
import com.yisus.ejemplo.model.Order;
import com.yisus.ejemplo.repository.OrderRepository;
import com.yisus.ejemplo.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;

    @Autowired
    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public boolean addOrder(AddOrderRequest request) {
        log.info("addOrder request = {}", JsonUtil.toJson(request.getOrder()));
        repository.save(request.getOrder());
        return true;
    }

    @Override
    public UpdateOrderResponse updateOrder(AddOrderRequest request) {
        return null;
    }
}
