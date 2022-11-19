package web.dao;

import web.model.User;

import java.util.List;

public interface UsersDao {
    List<User> getAllUsers();
    User getUser(Long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);

}
