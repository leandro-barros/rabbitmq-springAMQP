package com.example.springamqp.producer.dto;

import java.math.BigDecimal;

public class OrderEvent {

    private Long id;

    private BigDecimal value;

    public OrderEvent() {

    }

    public OrderEvent(Long id, BigDecimal value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
