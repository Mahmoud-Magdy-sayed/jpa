package com.project.learning.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learning.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
