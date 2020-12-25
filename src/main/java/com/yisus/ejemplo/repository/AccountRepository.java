package com.yisus.ejemplo.repository;

import com.yisus.ejemplo.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Integer> {
    List<Account> findByAccountNumber(String accountNumber);
}
