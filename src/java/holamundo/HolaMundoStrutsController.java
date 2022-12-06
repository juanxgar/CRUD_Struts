/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Win10
 */
public class HolaMundoStrutsController extends ActionSupport{

    private static final long serialVersionUID = 1L;
    private String mensaje;
    
    public String struts1() {
        mensaje = "Struts1";
        return SUCCESS;
    }
    
    public String struts2() {
        mensaje = "Struts2";
        return SUCCESS;
    }

    //Este get es necesario para poder pasar el mensaje a la vista
    public String getMensaje() {
        return mensaje;
    }
    
    

}
