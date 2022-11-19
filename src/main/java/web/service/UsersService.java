package web.service;

import web.model.User;

import java.util.List;

public interface UsersService {
    List<User> getUsers();
    User getUser(Long id);
    void addUser(User user);
    void saveUser(Long id, String firstName, String lastName, String email);
    void deleteUser(Long id);
}
