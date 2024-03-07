package com.example.task_3_1_4_bootstrap.repositories;

import com.example.task_3_1_4_bootstrap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
