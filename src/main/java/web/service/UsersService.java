package web.service;

import web.model.User;

import java.util.List;

public interface UsersService {
    List<User> getUsers();
    User getUser(long id);
    void addUser(User user);
    void saveUser(User user);
    void deleteUser(long id);
}
