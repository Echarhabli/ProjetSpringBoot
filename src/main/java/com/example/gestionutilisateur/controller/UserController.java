package com.example.gestionutilisateur.controller;


import com.example.gestionutilisateur.domain.User;
import com.example.gestionutilisateur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public void addUser(@RequestBody  User user){
        userService.addUser(user);
    }

    @GetMapping("/firstName")
    public List<User> getUserByFirstName(@RequestParam(name = "first_name",required = true) String firstName) {
       return userService.getUserByFirstName(firstName);
    }

    @GetMapping("/")
    public List<User> geUsers(){
        return userService.getUsers();
    }
    @DeleteMapping("/")
    public void deleteUsers(@RequestBody User user){
         userService.deleteUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable  Long id){
        userService.deleteUser(id);
    }
}
