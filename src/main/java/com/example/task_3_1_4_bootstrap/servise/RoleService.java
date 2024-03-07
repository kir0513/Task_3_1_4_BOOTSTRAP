package com.example.task_3_1_4_bootstrap.servise;

import com.example.task_3_1_4_bootstrap.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllUsers();

    void save(Role role);

    void deleteById(Long id);

    Role showUserById(Long id);
}
