package com.dev.taoxanh.controller.admin;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.dev.taoxanh.domain.User;
import com.dev.taoxanh.service.UploandService;
import com.dev.taoxanh.service.UserService;

@Controller
public class UserController {
    private final UserService userService;
    private final UploandService uploandService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, UploandService uploandService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.uploandService = uploandService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/admin/user")
    public String getUserPage(Model model) {
        List<User> users = this.userService.getAllUsers();
        System.out.println(">>> Check users arr " + users);
        model.addAttribute("users1", users);
        return "admin/user/show";
    }

    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user",user);
        model.addAttribute("id", id);
        return "admin/user/detail";
    }

    @GetMapping(value = "/admin/user/create")
    public String getCreateUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @PostMapping(value = "/admin/user/create")
    public String createUserPage(Model model,
            @ModelAttribute("newUser") User newU,
            @RequestParam("file") MultipartFile file) {
        String avatar = this.uploandService.handleSaveUploandFile(file, "avatar");

        String hashPassword = this.passwordEncoder.encode(newU.getPassword());

        newU.setAvatar(avatar);
        newU.setPassword(hashPassword);

        newU.setRole(this.userService.getRoleByName(newU.getRole().getName()));
        // save
        this.userService.handleSaveUser(newU);
        return "redirect:/admin/user";
    }

    @RequestMapping("/admin/user/update/{id}") // GET
    public String getUpdateUserPage(Model model, @PathVariable long id) {
        User currentUser = this.userService.getUserById(id);
        model.addAttribute("newUser", currentUser);
        return "admin/user/update";
    }

    @PostMapping("/admin/user/update")
    public String postUpdateUser(Model model, @ModelAttribute("newUser") User user) {
        User currentUser = this.userService.getUserById(user.getId());
        if (currentUser != null) {
            currentUser.setAddress(user.getAddress());
            currentUser.setUsername(user.getUsername());
            currentUser.setPhone(user.getPhone());
            currentUser.setDescription(user.getDescription());
            

            this.userService.handleSaveUser(currentUser);
        }
        return "redirect:/admin/user";
    }

    @GetMapping("/admin/user/delete/{id}")
    public String getDeleteUserPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // User user = new User();
        // user.setId(id);
        model.addAttribute("newUser", new User());
        return "admin/user/delete";
    }

    @PostMapping("/admin/user/delete")
    public String postDeleteUserPage(Model model, @ModelAttribute("newUser") User thanh) {
        this.userService.deleteAUser(thanh.getId());
        return "redirect:/admin/user";
    }
}
