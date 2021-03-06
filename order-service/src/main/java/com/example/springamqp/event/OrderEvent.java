package com.example.springamqp.event;

import com.example.springamqp.event.dto.OrderEventDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderEvent {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(OrderEventDto orderEventDto) {
        rabbitTemplate.convertAndSend("orders.v1.order-created.generate-cashback", orderEventDto);
        rabbitTemplate.convertAndSend("orders.v1.order-created.send-notification", orderEventDto);
        sendMessageExchange(orderEventDto);
    }

    public void sendMessageExchange(OrderEventDto orderEventDto) {
        orderEventDto.setValue(BigDecimal.valueOf(100));
        rabbitTemplate.convertAndSend("orders.v1.order-created", "", orderEventDto);
    }

}
