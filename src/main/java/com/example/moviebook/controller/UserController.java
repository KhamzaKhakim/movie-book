package com.example.moviebook.controller;

import com.example.moviebook.db.Movie;
import com.example.moviebook.db.User;
import com.example.moviebook.db.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/api/user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }


    @GetMapping("/api/user")
    public List<User> addUser(){
        return userRepository.findAll();
    }

    @GetMapping("api/user/{id}")
    public User showUserById(@PathVariable String id) {
        return userRepository.findUserById(id);
    }


    @DeleteMapping("api/user/{id}")
    public void deleteUserById(@PathVariable String id){
        userRepository.delete(userRepository.findUserById(id));
    }
}
