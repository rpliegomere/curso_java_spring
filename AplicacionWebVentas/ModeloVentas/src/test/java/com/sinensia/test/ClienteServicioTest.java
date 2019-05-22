/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.logica.ServicioClientes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteServicioTest {
    private static ServicioClientes servCli;
    
    @BeforeClass
    public static void setUpClass() {
        servCli = new ServicioClientes();
    }
    @Test
    public void clienteOk_1() {
        // assert = afirmar/asegurar
        assertNotNull(servCli.insertar("Ok", "email@ok.com", "ok12", "30", "on"));
        assertEquals( servCli.obtenerUno("email@ok.com").getNombre(), "Ok");
        servCli.eliminar("email@ok.com");
        assertNull(servCli.obtenerUno("email@ok.com"));
    }
    @Test
    public void clienteOk_2() {
        servCli.insertar("Cliente Ok", "email_1@ok.com", "ok12", "30", "on");
        servCli.insertar("Cliente Ok", "email_2@ok.com", "ok12", "25", "on");
        assertEquals( servCli.obtenerUno("email_1@ok.com").getEdad(), 30);
        assertTrue( servCli.obtenerUno("email_2@ok.com").getActivo() == 1);
        servCli.eliminar("email_1@ok.com");
        servCli.eliminar("email_2@ok.com");
        assertNull(servCli.obtenerUno("email_1@ok.com"));
        assertNull(servCli.obtenerUno("email_2@ok.com"));
    }
     @Test
    public void clienteMal_Nombre() {
        servCli.insertar("", "clienteMal_1@ok.com", "ok12", "30", "on");
         assertNull(servCli.obtenerUno("clienteMal_1@ok.com"));
    }
    @Test
    public void clienteMal_OtrosCampos() {
        servCli.insertar("Nombre bien", "", "ok12", "30", "on");
        assertNull(servCli.obtenerUno(""));
        servCli.insertar("Bien", "clien@ok.com", "", "30", "on");
        servCli.insertar("Ok", "client_2@ok.com", "ok12", "0", "on");
        servCli.insertar("Ok", "client_3@ok.com", "ok12", "NoNUM", "on");
        assertNull(servCli.obtenerUno("clien@ok.com"));
        assertNull(servCli.obtenerUno("client_2@ok.com"));
        assertNull(servCli.obtenerUno("client_3@ok.com"));
    }
    
    @Test
    public void modificarBien(){
        assertNotNull(servCli.insertar("Mar", "mar@ok.com", "mar12", "30", "on"));
        Cliente cliente = servCli.obtenerUno("mar@ok.com");
        servCli.modificar(cliente.getId(), "Modificado", "mod@mod.com", "mod123", "12", "on");
        servCli.eliminar("mod@mod.com");
        assertNull(servCli.obtenerUno("mod@mod.com"));
        assertNull(servCli.obtenerUno("mar@ok.com"));
    }
    
     @Test
    public void modificarMal(){
        assertNotNull(servCli.insertar("Mar1", "mar1@ok.com", "mar112", "30", "on"));
        assertNotNull(servCli.insertar("Mar2", "mar2@ok.com", "mar212", "31", "on"));
        assertNotNull(servCli.insertar("Mar3", "mar3@ok.com", "mar312", "32", "on"));
        assertNotNull(servCli.insertar("Mar4", "mar4@ok.com", "mar412", "33", "on"));
        Cliente cliente = servCli.obtenerUno("mar1@ok.com");
        servCli.modificar(cliente.getId(), "", "mod1@mod.com", "mod2123", "12", "on");
        Cliente cliente1 = servCli.obtenerUno("mar2@ok.com");
        servCli.modificar(cliente.getId(), "Mod2", "", "mod2123", "22", "on");
        Cliente cliente2 = servCli.obtenerUno("mar3@ok.com");
        servCli.modificar(cliente.getId(), "Mod3", "mod3@mod.com", "", "52", "on");
        Cliente cliente3 = servCli.obtenerUno("mar4@ok.com");
        servCli.modificar(cliente.getId(), "Mod4", "mod4@mod.com", "mod2123", "", "on");
        servCli.eliminar("mar1@ok.com");
        servCli.eliminar("mar2@ok.com");
        servCli.eliminar("mar3@ok.com");
        servCli.eliminar("mar4@ok.com");
        assertNull(servCli.obtenerUno("mod2@mod.com"));
        assertNull(servCli.obtenerUno("mar2@ok.com"));
    }
}
