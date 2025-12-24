package com.shopwithme.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopwithme.productservice.model.CartItem;
import com.shopwithme.productservice.repository.CartRepository;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*") // Allow HTML to access this
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    // 1. Add item to cart
    @PostMapping
    public CartItem addToCart(@RequestBody CartItem cartItem) {
        return cartRepository.save(cartItem);
    }

    // 2. Get all items in cart
    @GetMapping
    public List<CartItem> getCartItems() {
        return cartRepository.findAll();
    }

    // 3. Remove item from cart
    @DeleteMapping("/{id}")
    public void removeFromCart(@PathVariable Long id) {
        cartRepository.deleteById(id);
    }
}