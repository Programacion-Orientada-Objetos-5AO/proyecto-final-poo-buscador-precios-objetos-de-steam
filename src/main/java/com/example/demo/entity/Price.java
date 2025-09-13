package com.seeker.demo.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
public class Price {

    @Id
    @GeneratedValue
    private Long id;

    private Double value;

    @Enumerated(EnumType.STRING)
    private CurrencyType currency;

    private String source;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
