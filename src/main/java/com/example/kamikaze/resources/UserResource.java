package com.example.kamikaze.resources;


import com.example.kamikaze.entities.User;
import com.example.kamikaze.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        System.out.println("Message");
//        User u = new User(1L, "Matheus Fernandes Pinheiro", "matheu@email.com", "3231231", "123456");
        List<User> list = service.findAll();
        System.out.println("Message2222222222");



        return ResponseEntity.ok().body(list);
//        return  ResponseEntity.ok().body(u);
    }
}
