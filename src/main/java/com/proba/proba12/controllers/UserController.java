package com.proba.proba12.controllers;


import com.proba.proba12.models.User;
import com.proba.proba12.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
 UserService userService;



    @GetMapping(value = "/all")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping(value = "/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }


}
