package net.vanomuse.usermanager.service;

import net.vanomuse.usermanager.model.User;
import java.util.List;


public interface UserService {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById(int id);

    public Object listUsers();
}

