/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
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
    
}
