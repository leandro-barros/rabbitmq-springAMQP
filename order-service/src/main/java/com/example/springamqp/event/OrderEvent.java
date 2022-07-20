package com.example.springamqp.event;

import com.example.springamqp.event.dto.OrderEventDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderEvent {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(OrderEventDto orderEventDto) {
        String routingKey = "orders.v1.order-created";
        rabbitTemplate.convertAndSend(routingKey, orderEventDto);
    }

}
