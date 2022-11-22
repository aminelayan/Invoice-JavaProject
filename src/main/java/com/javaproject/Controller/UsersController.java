package com.javaproject.Controller;

import com.javaproject.Models.Item;
import com.javaproject.Models.User;
import com.javaproject.Services.UserService;
import com.javaproject.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

// imports removed for brevity
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
@Controller
public class UsersController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserValidator userValidator;

    public UsersController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @RequestMapping("/registration")
    public String registerForm(@Valid @ModelAttribute("user") User user) {
        return "reg.jsp";
    }

    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {

        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "reg.jsp";
        }
        userService.saveUserWithAdminRole(user);
//        userService.saveWithUserRole(user);
//        userService.saveUserWithAuditorRole(user);

        return "redirect:/login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout, Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if (logout != null) {
            model.addAttribute("logoutMessage", "Logout Successful!");
        }
        return "login.jsp";
    }

    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        // 1
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "home.jsp";
    }


    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "admin.jsp";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/users")
    public String showAllUsers(Model model, Principal principal) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "users.jsp";
    }

//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    @GetMapping("/users/{id}/edit")
//    public String editUserPage(@ModelAttribute("editUser")User user,@PathVariable("id")Long id) {
//        String username = principal.getName();
//        model.addAttribute("currentUser", userService.findByUsername(username));
//        List<User> allUsers = userService.getAllUsers();
//        model.addAttribute("allUsers", allUsers);
//        return "users.jsp";

    }


