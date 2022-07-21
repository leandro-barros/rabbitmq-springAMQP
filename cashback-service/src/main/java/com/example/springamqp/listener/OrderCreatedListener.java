package com.example.springamqp.listener;

import com.example.springamqp.listener.dto.OrderListenerDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = "${queue-order-created}")
    public void onOrderCreated(OrderListenerDto orderListenerDto) {
        System.out.println("Order received: " + orderListenerDto.getId());
    }

}
