package com.susha.prac.sampapp.service;

import com.susha.prac.sampapp.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService{
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUser();
    void deleteUser(Long userId);
    User updateUser(User user);
}

