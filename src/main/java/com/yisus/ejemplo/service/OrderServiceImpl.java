package com.yisus.ejemplo.service;

import com.yisus.ejemplo.controller.AddOrderRequest;
import com.yisus.ejemplo.controller.AddOrderResponse;
import com.yisus.ejemplo.controller.UpdateOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    //private final ClientRepository repository;

    //@Autowired
    public OrderServiceImpl(/*ClientRepository repository*/) {
        //this.repository = repository;
    }


    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public AddOrderResponse addOrder(AddOrderRequest request) {
        return null;
    }

    @Override
    public UpdateOrderResponse updateOrder(AddOrderRequest request) {
        return null;
    }
}
