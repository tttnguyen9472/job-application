package com.jobapplication.service;

import com.jobapplication.model.User;

import java.util.Optional;

public interface UserService {

  Optional<User> getUserById(Long id);
}
