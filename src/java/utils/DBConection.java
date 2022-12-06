/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Win10
 */
public class DBConection {

    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/struts-crud";
            String user = "postgres";
            String password = "admin";

            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            System.out.println("Error >> Driver no instalado");
        } catch (SQLException e) {
            System.out.println("Error >> Conexion con la BD");
        }

        return con;
    }
}
