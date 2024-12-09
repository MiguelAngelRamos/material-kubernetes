package com.kibernumacademy.orderservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kibernumacademy.orderservice.model.User;

// Define el nombre del servicio y la URL base (Kubernetes gestionará la resolución)
@FeignClient(name = "user-service", url = "http://user-service.production.svc.cluster.local:8080")
public interface UserClient {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}