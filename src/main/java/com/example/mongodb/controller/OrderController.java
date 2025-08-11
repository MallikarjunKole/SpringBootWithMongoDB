package com.example.mongodb.controller;

import com.example.mongodb.entity.Order;
import com.example.mongodb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{getOrders}")
    public ResponseEntity<List<Order>> getOrdersList() {

        List<Order> result = orderService.getOrdersList();
        return ResponseEntity.ok(result);
    }
}
