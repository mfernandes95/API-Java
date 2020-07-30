package com.example.kamikaze.repositories;


import com.example.kamikaze.entities.OrderItem;
import com.example.kamikaze.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
