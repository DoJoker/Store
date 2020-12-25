package com.yisus.ejemplo.repository;

import com.yisus.ejemplo.model.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<Client,Integer> {

}
