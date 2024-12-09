package com.kibernumacademy.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kibernumacademy.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
  
}
