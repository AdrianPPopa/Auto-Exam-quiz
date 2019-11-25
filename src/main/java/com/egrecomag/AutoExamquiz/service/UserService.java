package com.egrecomag.AutoExamquiz.service;

import com.egrecomag.AutoExamquiz.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}