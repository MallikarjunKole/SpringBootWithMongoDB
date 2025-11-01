package com.example.mongodb.controller;

import com.example.mongodb.entity.Order;
import com.example.mongodb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public Mono<Order> createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/getOrdersList")
    public Flux<Order> getOrdersList() {
        Flux<Order> result = orderService.getOrdersList();
        return result;
    }
}
