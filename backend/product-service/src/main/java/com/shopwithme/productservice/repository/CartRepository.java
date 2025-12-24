package com.shopwithme.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopwithme.productservice.model.CartItem;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> {
    // We can add custom queries here later if needed
}