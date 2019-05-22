/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.dao;

import com.sinensia.modelo.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MySQLClienteDAO implements InterfazDAO<Cliente>{
    public MySQLClienteDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(
            new com.mysql.cj.jdbc.Driver());
        }catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName()).log(Level.SEVERE, "Error SQL", ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(MySQLClienteDAO.class.getName()).log(Level.SEVERE, "Error en la Clase", ex);
        }catch (Exception ex){
            Logger.getLogger(MySQLClienteDAO.class.getName()).log(Level.SEVERE, "Otro Error", ex);
        }
    }
    
    public boolean crear(String nombre, String email,
            String passwd, int edad, boolean activo) {
        try (Connection conex = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&useSSL=false&serverTimezone=UTC",
                "admin", "Admin1234")) {
            String sqlQuery = 
                    "INSERT INTO cliente (nombre, email, password, edad, activo) "
                    + " VALUES ( '" + nombre + "' , '" + email + "' , '" + passwd
                    + "' , " + edad + " , " + (activo ? "1" : "0") + " ) ";
            Statement sentencia = conex.createStatement();
            sentencia.executeUpdate(sqlQuery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
            return false;
        }
    }

    @Override
    public Cliente insertar(Cliente valor) {
        
    }

    @Override
    public Cliente obtenerUno(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cliente valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente modificar(Cliente nuevoValor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}