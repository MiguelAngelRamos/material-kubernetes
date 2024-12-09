package com.kibernumacademy.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kibernumacademy.orderservice.client.UserClient;
import com.kibernumacademy.orderservice.model.Order;
import com.kibernumacademy.orderservice.model.User;
import com.kibernumacademy.orderservice.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private UserClient userClient;
    
    public Order createOrder(Order order) {
        try {
            // Verificar si el usuario existe
            User user = userClient.getUserById(order.getUserId());
            if (user == null) {
                throw new RuntimeException("Usuario no encontrado");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al verificar el usuario: " + e.getMessage());
        }
        return orderRepository.save(order);
    }
    
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}