package com.example.kamikaze.services;


import com.example.kamikaze.entities.Order;
import com.example.kamikaze.repositories.OrderrRepository;
import com.example.kamikaze.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderrRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);

        return obj.get();
    }



}
