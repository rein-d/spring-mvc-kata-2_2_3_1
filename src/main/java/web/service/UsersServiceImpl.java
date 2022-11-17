package web.service;

import org.springframework.stereotype.Service;
import web.dao.UsersDao;
import web.model.User;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    private final UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public List<User> getUsers() {
       return usersDao.getAllUsers();
    }

    @Override
    public User getUser(long id) {
        return usersDao.getUser(id);
    }

    @Override
    public void addUser(User user) {
        usersDao.addUser(user);
    }

    @Override
    public void saveUser(User user) {
        usersDao.updateUser(user);
    }

    @Override
    public void deleteUser(long id) {
        usersDao.deleteUser(id);
    }
}
