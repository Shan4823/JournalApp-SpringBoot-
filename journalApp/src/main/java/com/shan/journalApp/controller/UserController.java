package com.shan.journalApp.controller;

import com.shan.journalApp.entity.User;
import com.shan.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Get all users.
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    /**
     * Create a new user (use POST).
     */
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User existingUser = userService.findByUserName(user.getUserName());
        if (existingUser != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT); // username already exists
        }
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    /**
     * Update an existing user (use PUT).
     */
    @PutMapping("/{userName}")
    public ResponseEntity<User> updateUser(@PathVariable String userName, @RequestBody User user) {
        User userInDb = userService.findByUserName(userName);
        if (userInDb == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userInDb.setUserName(user.getUserName());
        userInDb.setPassword(user.getPassword());
        userService.saveUser(userInDb);
        return new ResponseEntity<>(userInDb, HttpStatus.OK);
    }
}
