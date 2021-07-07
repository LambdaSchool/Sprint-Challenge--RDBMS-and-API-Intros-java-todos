package com.sprint.todo.services;

import com.sprint.todo.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserByUsername(String username);

    User findUserById(long id);

    void delete(long id);

    User save(User user);

    User update(User user, long id);
}