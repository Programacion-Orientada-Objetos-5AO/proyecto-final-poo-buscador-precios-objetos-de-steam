package com.seeker.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long definex;

    private String nombre;

    private String calidad;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Price> prices;
}
