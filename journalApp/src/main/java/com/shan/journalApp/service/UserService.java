package com.shan.journalApp.service;

import com.shan.journalApp.entity.User;
import com.shan.journalApp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserService {
    // controller --> service --> repository

    @Autowired
    private UserRepository userRepository;

    /**
     * Save or update a user.
     */
    public void saveUser(User user) {
        userRepository.save(user);
    }

    /**
     * Fetch all users.
     */
    public List<User> getAll() {
        return userRepository.findAll();
    }

    /**
     * Find a user by ID.
     */
    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }

    /**
     * Delete a user by ID.
     */
    public void deleteById(ObjectId id) {
        userRepository.deleteById(id);
    }

    /**
     * Find a user by username.
     */
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public void saveEntry(User user) {
    }
}
