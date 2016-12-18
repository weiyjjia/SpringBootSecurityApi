package com.eastteam.service;

import java.util.List;

import com.eastteam.model.User;

public interface UserService {
    User getUserByUsername(String username);

    List<String> getPermissions(String username);

    User getCurrentUser();

    Boolean isCurrentUserLoggedIn();
}
