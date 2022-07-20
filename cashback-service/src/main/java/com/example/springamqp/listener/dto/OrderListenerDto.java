package com.example.springamqp.listener.dto;

import java.math.BigDecimal;

public class OrderListenerDto {

    private Long id;

    private BigDecimal value;

    public OrderListenerDto() {

    }

    public OrderListenerDto(Long id, BigDecimal value) {
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
