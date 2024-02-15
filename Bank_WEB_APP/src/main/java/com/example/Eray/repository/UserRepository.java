package com.example.Emirhan.repository;

import com.example.Emirhan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    List<User> findByRole(String role);
}
