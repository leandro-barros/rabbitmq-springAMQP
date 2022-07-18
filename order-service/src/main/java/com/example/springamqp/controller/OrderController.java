package com.example.springamqp.controller;

import com.example.springamqp.model.OrderModel;
import com.example.springamqp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/orders")
public class OrderController {

    @Autowired
    private OrderRepository orders;

    @PostMapping
    public OrderModel create(@RequestBody OrderModel order) {
        orders.save(order);

        return order;
    }

    @GetMapping
    public List<OrderModel> list() {
        return orders.findAll();
    }

    @GetMapping("/{id}")
    public OrderModel findById(@PathVariable Long id) {
        return orders.findById(id).orElseThrow();
    }

    @PutMapping("{id}/pay")
    public OrderModel pay(@PathVariable Long id) {
        OrderModel order = orders.findById(id).orElseThrow();
        order.markAsPaid();
        return orders.save(order);
    }
}
