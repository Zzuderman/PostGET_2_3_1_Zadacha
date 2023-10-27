package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();
    User getUser(int id);
    void addUser(User user);
    Object deleteUser(int id);
    void editUser(User user);
}