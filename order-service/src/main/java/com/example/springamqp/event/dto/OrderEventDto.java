package com.example.springamqp.event.dto;

import java.math.BigDecimal;

public class OrderEventDto {

    private Long id;

    private BigDecimal value;

    public OrderEventDto() {

    }

    public OrderEventDto(Long id, BigDecimal value) {
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
