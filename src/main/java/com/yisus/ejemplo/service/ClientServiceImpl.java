package com.yisus.ejemplo.service;

import com.yisus.ejemplo.model.Client;
import com.yisus.ejemplo.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Client> getClients() {
        log.info("getClient");
        return (List<Client>) repository.findAll();
    }

}
