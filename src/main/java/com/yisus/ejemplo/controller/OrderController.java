package com.yisus.ejemplo.controller;

import com.yisus.ejemplo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class OrderController {

    private final OrderService orderService;

    /**
     * Inject the order service via constructor.
     * @param orderService the service to manage order.
     */
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Retrieve an order by id.
     * @param idOrder param to perform a search for an order.
     * @return the response to client.
     */
    @GetMapping("/order/{idOrder}")
    ResponseEntity<String> getOrder(@PathVariable("idOrder") String idOrder) {
        log.info("GET /order/{idOrder} idOrder = {}", idOrder);
        return new ResponseEntity<>("hole", HttpStatus.OK);
    }

    /**
     *
     * @param request
     * @return
     */
    @PostMapping("/order")
    ResponseEntity<AddOrderResponse> addOrder(@RequestBody AddOrderRequest request) {
        log.info("POST /order request = {}", request);
        AddOrderResponse response = orderService.addOrder(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     *
     * @param request
     * @return
     */
    @PutMapping("/order")
    ResponseEntity<UpdateOrderResponse> updateOrder(@RequestBody AddOrderRequest request) {
        log.info("PUT /order request = {}", request);
        UpdateOrderResponse response = orderService.updateOrder(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
