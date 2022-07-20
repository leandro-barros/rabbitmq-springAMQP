package com.example.springamqp.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = "${queue-order-created}")
    public void onOrderCreated(String message) {
        System.out.println("Message received: " +  message);
    }

}
