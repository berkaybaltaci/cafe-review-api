package com.example.myrestapi.user;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUser(Long id);
}