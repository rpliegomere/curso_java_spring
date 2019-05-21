/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MySQLCliente {
    public MySQLCliente(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(
            new com.mysql.cj.jdbc.Driver());
        }catch (SQLException ex) {
            Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "Error SQL", ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "Error en la Clase", ex);
        }catch (Exception ex){
            Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "Otro Error", ex);
        }
    }
    
    public boolean crear(String nombre, String email, String password, int edad, boolean activo){
        try (Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&useSSL=false&serverTimezone=UTC", "admin", "Admin1234")){
            
            String sqlQUERY = 
                    "INSERT INTO cliente (nombre, email, password, edad, activo)"  + " VALUES ( '" + nombre + "' , '" + email + "' , '" + password + "' , " + edad + " , " + (activo ? "1" + : "0") + ")";
            Statement sentencia = conex.createStatement();
            sentencia.execute(sqlQUERY);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "Error SQL", ex);
            return false;
        }
    }
}
