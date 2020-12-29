package com.yisus.ejemplo.repository;

import com.yisus.ejemplo.model.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order,Integer> {

}
