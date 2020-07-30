package com.example.kamikaze.repositories;


import com.example.kamikaze.entities.Category;
import com.example.kamikaze.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {


}
