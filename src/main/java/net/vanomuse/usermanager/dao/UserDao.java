package net.vanomuse.usermanager.dao;

import net.vanomuse.usermanager.model.User;
import java.util.list;

public interface UserDao {
        public void addUser(User user);
        public void updateUser(User user);
        public void removeUser(User user);
        public User getUserById(int id);
        public List<User> listUsers();
}
