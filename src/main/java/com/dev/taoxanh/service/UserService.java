package com.dev.taoxanh.service;

import java.util.List;
import com.dev.taoxanh.domain.Role;
import com.dev.taoxanh.domain.User;
import com.dev.taoxanh.repository.RoleRepository;
import com.dev.taoxanh.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User handleSaveUser(User user) {
        User newUser = this.userRepository.save(user);
        return newUser;
    }

    public User getUserById(long id){
        return this.userRepository.findById(id);
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByRoleName(name);
    }

}
