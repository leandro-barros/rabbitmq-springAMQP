package com.example.springamqp.service.impl;

import com.example.springamqp.model.OrderModel;
import com.example.springamqp.repository.OrderRepository;
import com.example.springamqp.service.OrderService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public OrderModel save(OrderModel orderModel) {
        OrderModel orderModelSaved = orderRepository.save(orderModel);

        String routingKey = "orders.v1.order-created";
        Message message = new Message(orderModelSaved.getId().toString().getBytes());
        rabbitTemplate.send(routingKey, message);

        return orderModelSaved;
    }
}
