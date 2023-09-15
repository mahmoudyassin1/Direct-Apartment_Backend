package com.DirectApartment.controller;

import com.DirectApartment.model.User;
import com.DirectApartment.model.user_login;
import com.DirectApartment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping ("/sign up")
    public User User_sign_Up(@RequestBody User user)
    {
        return userService.sign_Up(user);
    }

   @PostMapping  ("/login")
    public User User_login(@RequestBody user_login userLogin)
    {
        return userService.login(userLogin);
    }

    @GetMapping("/users/findAll")
    public List<User>ShowAll()
    {
        return userService.showAll();
    }



}
