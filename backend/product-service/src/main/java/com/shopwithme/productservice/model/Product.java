package com.shopwithme.productservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;          // "Red Printed T-shirts"
    private String imageUrl;      // "images/product-1.jpg"
    private BigDecimal price;     // 300.00
    private Double rating;        // 4.0
    private String category;      // "Men", "Shoes", "Watch"
    
    @Column(length = 1000)
    private String description;   // Detailed text for product-details.html
}