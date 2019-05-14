/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
=======

>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
<<<<<<< HEAD
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProbandoDAO {
    public static void probarCliente(){
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, "Ana", "aa@a.com"));
        repoCli.poner(new ClienteInvitado(2, "Juan", "jj@j.com"));
        repoCli.poner(new ClienteInvitado(3, "Bea", "bb@b.com"));
        System.out.println("Cliente: " + repoCli.leerUno(2).toString());
        System.out.println("Lista: " + repoCli.leerTodos());
        
        repoCli.modificar(new Cliente(2, "asdadd", "asdasdasd"));
        Cliente cli = repoCli.leerUno(2);
        System.out.println("Cliente Modificado" + cli.toString());
       
        System.out.println("Lista: " + repoCli.leerTodos());
        
    }
    
=======

/**
 *
 * @author Admin - German
 */
public class ProbandoDAO {
    public static void probarCliente() {
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, "Ana", "aaa@a"));
        repoCli.poner(new ClienteInvitado(2, "Juan", "jjj@a"));
        repoCli.poner(new ClienteInvitado(3, "Bea", "bbb@a"));
        System.out.println("Juan: " + repoCli.leerUno(2).toString());
        System.out.println("Repo: " + repoCli.toString());
    }
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
}
