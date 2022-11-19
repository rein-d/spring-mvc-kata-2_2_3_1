package web.service;

import org.springframework.stereotype.Service;
import web.dao.UsersDao;
import web.model.User;

import javax.transaction.Transactional;
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
    public User getUser(Long id) {
        return usersDao.getUser(id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        usersDao.addUser(user);
    }

    @Transactional
    @Override
    public void saveUser(Long id, String firstName, String lastName, String email) {
        User existingUser = this.getUser(id);
        existingUser.setId(id);
        existingUser.setFirstName(firstName);
        existingUser.setLastName(lastName);
        existingUser.setEmail(email);
        usersDao.updateUser(existingUser);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        usersDao.deleteUser(id);
    }
}
