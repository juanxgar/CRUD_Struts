/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Beans es igual a entity
package entity;

import java.util.Date;

/**
 *
 * @author Win10
 */
public class User {

    private Long user_id;
    private String name;
    private String lastname;
    private String username;
    private String password;
    private Date created_on;

    public User(Long user_id, String name, String lastname, String username, String password, Date created_on) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.created_on = created_on;
    }

    public User() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

}
