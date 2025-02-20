package com.lekimthanh.taoxanh.controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.lekimthanh.taoxanh.domain.Role;
import com.lekimthanh.taoxanh.domain.User;
import com.lekimthanh.taoxanh.service.UploadService;
import com.lekimthanh.taoxanh.service.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    private final UserService userService;
    private final UploadService uploadService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, UploadService uploadService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.uploadService = uploadService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String getUserPage(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "admin/user/show";
    }

    @GetMapping("/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id) {
        Optional<User> user = userService.getUserById(id);
        if (user.isEmpty())
            return "redirect:/admin/user";
        model.addAttribute("user", user.get());
        return "admin/user/detail";
    }

    @GetMapping("/create")
    public String getCreateUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("newUser") User user, @RequestParam("avatarFile") MultipartFile file) {
        String avatar = uploadService.handleSaveUploadFile(file, "avatar");
        user.setAvatar(avatar);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Optional<Role> role = userService.getRoleByName(user.getRole().getName());
        userService.saveUser(user);
        return "redirect:/admin/user";
    }

    @GetMapping("/update/{id}")
    public String getUpdateUserPage(Model model, @PathVariable long id) {
        Optional<User> user = userService.getUserById(id);
        if (user.isEmpty())
            return "redirect:/admin/user";
        model.addAttribute("newUser", user.get());
        return "admin/user/update";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("newUser") User user) {
        Optional<User> currentUserOpt = userService.getUserById(user.getId());
        if (currentUserOpt.isPresent()) {
            User currentUser = currentUserOpt.get();
            currentUser.setAddress(user.getAddress());
            currentUser.setFullName(user.getFullName());
            currentUser.setPhone(user.getPhone());
            userService.saveUser(currentUser);
        }
        return "redirect:/admin/user";
    }

    @GetMapping("/delete/{id}")
    public String getDeleteUserPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        return "admin/user/delete";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        userService.deleteUserById(id);
        return "redirect:/admin/user";
    }

}
