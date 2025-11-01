package com.example.mongodb.service;

import com.example.mongodb.entity.Order;
import com.example.mongodb.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Flux<Order> getOrdersList() {
        return orderRepository.findAll().filter(a -> Optional.ofNullable(a.getTotalAmount()).orElse(0.0) > 1000)
                .filter(customer -> customer.getCustomerId().equalsIgnoreCase("cust004"));
    }


    public Mono<Order> createOrder(Order order) {
        return orderRepository.save(order);
    }
}
