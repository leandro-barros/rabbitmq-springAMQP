package com.example.springamqp.service;

import com.example.springamqp.model.OrderModel;
import org.springframework.stereotype.Component;

@Component
public interface OrderService {

    public OrderModel save(OrderModel orderModel);

}
