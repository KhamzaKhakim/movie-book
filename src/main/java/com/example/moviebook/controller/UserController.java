package com.example.moviebook.controller;

import com.example.moviebook.db.User;
import com.example.moviebook.db.UserRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/api/admin/user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }


    @GetMapping("/api/admin/user")
    public List<User> addUser(){
        return userRepository.findAll();
    }

//    @GetMapping("api/user/{id}")
//    public User showUserById(@PathVariable String id) {
//        return userRepository.findUserById(id);
//    }
//
//
//    @DeleteMapping("api/user/{id}")
//    public void deleteUserById(@PathVariable String id){
//        userRepository.delete(userRepository.findUserById(id));
//    }
}
