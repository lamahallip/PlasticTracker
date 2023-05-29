package com.plasticTracker.service;

import com.plasticTracker.model.User;

import java.util.List;

public interface UserServices {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserbyId (int userId);
    User updateUser(User user);
    void deleteUser(int userId);
}
