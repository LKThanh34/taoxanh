package com.lekimthanh.taoxanh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lekimthanh.taoxanh.domain.Role;
import com.lekimthanh.taoxanh.domain.User;
import com.lekimthanh.taoxanh.repository.RoleRepository;
import com.lekimthanh.taoxanh.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    public Optional<Role> getRoleByName(String name) {
        return Optional.ofNullable(roleRepository.findByName(name));
    }

}
