/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.User;
import dao.UserDao;
import java.util.List;

/**
 *
 * @author Win10
 */
public class UserController {

    private UserDao userDao = new UserDao();

    /**
     * Do the register of a user
     *
     * @param user
     * @return state if the register is done or not
     */
    public boolean UserRegister(User user) {
        return userDao.UserRegister(user);
    }

    /**
     * Get all the users registered
     *
     * @return users
     */
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    /**
     * Get only one user from the id param
     *
     * @param id
     * @return
     */
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    /**
     * Update the data of a user from the id param
     *
     * @param user
     * @param id
     * @return state if the update is done or not
     */
    public boolean updateUser(User user, Long id) {
        boolean state = userDao.updateUser(user, id);

        if (state) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Delete a register of a user from the id param
     *
     * @param user
     * @param id
     * @return state if the delete is done or not
     */
    public boolean deleteUser(User user, Long id) {
        boolean state = userDao.deleteUser(user, id);

        if (state) {
            return true;
        } else {
            return false;
        }
    }
}
