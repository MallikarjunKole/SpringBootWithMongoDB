package com.example.mongodb.service;

import com.example.mongodb.entity.Order;
import com.example.mongodb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;
import java.util.Map;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    
    public List<Order> getOrdersList() {
        return orderRepository.findAll();
    }
}
