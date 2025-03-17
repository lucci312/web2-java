package com.example.levanluc.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    private String image;
    private String detailDesc;
    private String shortDesc;
    private Long quantity;
    private Long sold;
    private String factory;
    private String target;
}
