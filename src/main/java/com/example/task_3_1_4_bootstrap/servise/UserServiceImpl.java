package com.example.task_3_1_4_bootstrap.servise;

import com.example.task_3_1_4_bootstrap.model.User;
import com.example.task_3_1_4_bootstrap.repositories.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, @Lazy PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User showUserById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, User user) {

    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }
}
