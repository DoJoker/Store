package com.yisus.ejemplo.repository;

import com.yisus.ejemplo.model.Movement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementRepository extends CrudRepository<Movement,Integer> {

}
