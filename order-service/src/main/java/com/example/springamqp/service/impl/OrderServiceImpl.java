package com.example.springamqp.service.impl;

import com.example.springamqp.model.OrderModel;
import com.example.springamqp.repository.OrderRepository;
import com.example.springamqp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderModel save(OrderModel orderModel) {
        return orderRepository.save(orderModel);
    }
}
