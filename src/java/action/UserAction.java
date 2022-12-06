package action;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import controller.UserController;
import entity.User;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Juan Diego Garcia
 */
public class UserAction extends ActionSupport {

    //Solo definiendo la variable con el mismo nombre del param, se setea
    //gracias a Strut
    private Long id;
    private String name;
    private String lastname;
    private String username;
    private String password;
    private User user;
    private List<User> users;
    private UserController userController;
    private String buttonMessage;
    private String action;

    //En Struts2, no existe ya la clase Dspatcher. Solo esta la form que
    //corresponde a las acciones que se realizan, asi como a los campos de los
    //formularios
    public UserAction() {
        super();
    }

    /**
     * Do the register of a user
     *
     * @return String with the result of the action
     */
    public String UserRegister() {
        userController = new UserController();
        user = new User(null, name, lastname, username, password, null);

        try {
            boolean state = userController.UserRegister(user);
            if (state) {
                return SUCCESS;
            } else {
                return ERROR;
            }
        } catch (Exception e) {
            return ERROR;
        }
    }

    /**
     * Get all registered users
     *
     * @return String with the result of the action
     */
    public String getAllUsers() {
        userController = new UserController();
        try {
            List<User> users = userController.getUsers();
            setUsers(users);
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

    /**
     * Get only one user by user_id parameter
     *
     * @return String with the result of the action
     */
    public String getOneUser() {
        userController = new UserController();
        try {
            User userInfo = userController.getUser(id);

            setUser(userInfo);
            setId(userInfo.getUser_id());
            setName(userInfo.getName());
            setLastname(userInfo.getLastname());
            setUsername(userInfo.getUsername());
            setPassword(userInfo.getPassword());
            setButtonMessage("Editar");
            setAction("edit");
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
     * Update the information of a user using user_id parameter
     *
     * @return String with the result of the action
     */
    public String updateUser() {
        userController = new UserController();
        User userInfo = new User(id, name, lastname, username, password, null);
        try {
            boolean state = userController.updateUser(userInfo, id);
            if (state) {
                return SUCCESS;
            } else {
                return ERROR;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
     * Delete a user using user_id parameter
     *
     * @return String with the result of the action
     */
    public String deleteUser() {
        userController = new UserController();
        User userInfo = new User(id, name, lastname, username, password, null);
        try {
            boolean state = userController.deleteUser(userInfo, id);
            if (state) {
                return SUCCESS;
            } else {
                return ERROR;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
     * Set the message of the button on the register form
     *
     * @return String with the result of the action
     */
    public String setButtonMessageRegisterForm() {
        setButtonMessage("Registrar");
        setAction("register");
        return SUCCESS;
    }

    /**
     * Set the message of the button on the edit form
     *
     * @return String with the result of the action
     */
    public String setButtonMessageEditForm() {
        //Hay dos maneras de obtener un param. El primero es crear la variable
        //con el mismo nombre, y Strut hara el proceso por si mismo, la otra
        //opcion es con la linea que aparece aquí abajo
        //String paramValue = ServletActionContext.getRequest().getParameter("id");
        setButtonMessage("Editar");
        return SUCCESS;
    }

    /**
     * Get the user_id
     *
     * @return user_id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the user_id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the user name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the user name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the user lastname
     *
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set the user lastname
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Set the user username
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the user username
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the user password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * set the user password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get a user object
     *
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * Set a user object
     *
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get a list of users
     *
     * @return users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Set a list of users
     *
     * @param users
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Get the button message of the form
     *
     * @return buttonMessage
     */
    public String getButtonMessage() {
        return buttonMessage;
    }

    /**
     * Set the button message of the form
     *
     * @param buttonMessage
     */
    public void setButtonMessage(String buttonMessage) {
        this.buttonMessage = buttonMessage;
    }

    /**
     * Get the action of the form
     *
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * Set the action of the form
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

}
