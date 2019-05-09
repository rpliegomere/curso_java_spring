/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_prueba;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Clientes cliente = new Clientes ();
     ArrayList<Clientes> cliente;
     cliente = new ArrayList();
     
     cliente.add(new Clientes(1, "Pedro", "csdc@adasd"));
     
     String infoCliente = cliente.mostrar();
        System.out.println(infoCliente);

    
    }
    
}
