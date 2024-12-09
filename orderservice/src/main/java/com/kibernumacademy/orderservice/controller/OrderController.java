package com.kibernumacademy.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kibernumacademy.orderservice.model.Order;
import com.kibernumacademy.orderservice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    // Crear un nuevo pedido
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
    
    // Obtener todos los pedidos
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}