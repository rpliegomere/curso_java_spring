/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
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
public class ClienteJUnitTest {
    
    public ClienteJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  /*  @Test
    public void probandoJUnit() {
        assertEquals(10, 10);
        assertEquals("Texto", "Texto");
        //assertEquals("Texto", "tExto");
        assertNotEquals("Texto", "tExto");
        
    }
    
    @Test
    public void probarClienteDAO() {
        ClienteDAO daoCli = new ClienteDAO();
        daoCli.insertar(new Cliente(1, "Pru", "pru@pru", (short) 20, (short) 1, "Pru1234"));
        daoCli.insertar(new Cliente(2, "Pru2", "pru2@pru2", (short) 22, (short) 2, "Pru12222"));
       // assertEquals(daoCli.leerTodos().size(), 2);
        Cliente cli = daoCli.obtenerUno(2);
        assertTrue(cli.getEmail().equals("pru2@pru2"));
    }*/

}
