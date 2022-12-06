/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Win10
 */
public class HolaMundo extends ActionSupport {

    private List<String> cursos;
    private static final String titulo = "Titulo de la pagina";

    private static final long SerialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        cursos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cursos.add(String.valueOf(i + 1));
        }
        //SUCCESS es una palabra definida en Struts que significa que se envia
        //la vist al usuario. En struts.xml, si es success, debe de llamarse success el result
        return SUCCESS;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFecha() {
        return new Date();
    }

}
