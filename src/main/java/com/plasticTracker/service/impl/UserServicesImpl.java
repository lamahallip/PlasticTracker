package com.plasticTracker.service.impl;

import com.plasticTracker.model.User;
import com.plasticTracker.repository.UserRepository;
import com.plasticTracker.service.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServicesImpl implements UserServices {

    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user) ;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll() ;
    }

    @Override
    public User getUserbyId(int userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User updateUser(User user) {

        User userExiting = userRepository.findById(user.getId()).get();
        userExiting.setNom(user.getNom());
        userExiting.setPrenom(user.getPrenom());
        userExiting.setEmail(user.getEmail());
        userExiting.setPassword(user.getPassword());

        return userRepository.save(userExiting);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
