package com.example.springamqp.service.impl;

import com.example.springamqp.event.OrderEvent;
import com.example.springamqp.event.dto.OrderEventDto;
import com.example.springamqp.model.OrderModel;
import com.example.springamqp.repository.OrderRepository;
import com.example.springamqp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderEvent orderEvent;

    @Override
    public OrderModel save(OrderModel orderModel) {
        OrderModel orderModelSaved = orderRepository.save(orderModel);

        var orderEventDto = new OrderEventDto(orderModelSaved.getId(), orderModelSaved.getValue());
        orderEvent.sendMessage(orderEventDto);

        return orderModelSaved;
    }
}
