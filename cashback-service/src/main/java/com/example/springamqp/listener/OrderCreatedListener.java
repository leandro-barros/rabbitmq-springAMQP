package com.example.springamqp.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = "${queue-order-created}")
    public void onOrderCreated(Long id) {
        System.out.println("Message received: " + id);
    }

}
