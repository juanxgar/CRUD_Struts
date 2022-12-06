/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.DBConection;

/**
 *
 * @author Win10
 */
public class UserDao {

    /**
     * Do the register of a user
     *
     * @param user
     * @return state if the register is done or not
     */
    public boolean UserRegister(User user) {
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = DBConection.getConection();
            String sql = "INSERT INTO users (name, lastname, username, password) VALUES (?,?,?,?)";
            pstm = con.prepareStatement(sql);

            pstm.setString(1, user.getName());
            pstm.setString(2, user.getLastname());
            pstm.setString(3, user.getUsername());
            pstm.setString(4, user.getPassword());

            pstm.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Get all the users registered
     *
     * @return users
     */
    public List<User> getUsers() {
        Connection con = null;
        PreparedStatement pstm = null;
        List<User> users = new ArrayList<>();

        try {
            con = DBConection.getConection();
            String sql = "SELECT * FROM users";
            pstm = con.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                User user = new User(
                        res.getLong(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getDate(6));

                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return users;
    }

    /**
     * Get only one user from the id param
     *
     * @param id
     * @return
     */
    public User getUser(Long id) {
        Connection con = null;
        PreparedStatement pstm = null;
        User user = new User();

        try {
            con = DBConection.getConection();
            String sql = "SELECT * FROM users where user_id = ?";
            pstm = con.prepareStatement(sql);

            pstm.setLong(1, id);

            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                user = new User(
                        res.getLong(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getDate(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return user;
    }

    /**
     * Update the data of a user from the id param
     *
     * @param user
     * @param id
     * @return state if the update is done or not
     */
    public boolean updateUser(User user, Long id) {
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = DBConection.getConection();
            String sql = "UPDATE users SET name=?, lastname=?, username=?, password=? WHERE user_id=? ";
            pstm = con.prepareStatement(sql);

            pstm.setString(1, user.getName());
            pstm.setString(2, user.getLastname());
            pstm.setString(3, user.getUsername());
            pstm.setString(4, user.getPassword());
            pstm.setLong(5, id);

            pstm.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
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
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = DBConection.getConection();
            String sql = "DELETE FROM users WHERE user_id=? ";
            pstm = con.prepareStatement(sql);

            pstm.setLong(1, id);

            pstm.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
