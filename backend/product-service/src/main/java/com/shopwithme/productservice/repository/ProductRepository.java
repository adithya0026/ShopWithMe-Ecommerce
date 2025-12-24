package com.shopwithme.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopwithme.productservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query to find products by category (e.g., for "Featured" vs "Latest")
    List<Product> findByCategory(String category);
}