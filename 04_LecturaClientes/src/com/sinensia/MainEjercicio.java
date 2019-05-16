/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import static com.sinensia.pruebas.Ficheros.lecturaFich;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fichFormWin = new File("C:\\Users\\Admin\\Desktop\\Curso_java\\curso_java_spring.git\\04_LecturaClientes\\Ejercicio ficheros.txt");

        Scanner escaner = null;
        HashMap<Long, Cliente> mapaDat = new HashMap<>();
        try {

            escaner = new Scanner(fichFormWin);
            while (escaner.hasNextLine()) { // Hasta el siguiente \n
                String linea = escaner.nextLine();

                for (int i = 1; i < 100000; i++) {
                    if (linea.startsWith(String.valueOf(i))) {
                        String datos[] = linea.split(",");
                        for (String dato : datos) {
                            // System.out.println("  Dato: " + dato);

                            Cliente cliente;
                            if (datos.length == 4 || datos.length == 5) {
                                long id = Integer.parseInt(datos[0]);
                                String nombre = datos[1];
                                String email = datos[2];
                                boolean activo = datos[3].equals("True");
                                int duracionMax = 0;
                                if (datos.length == 5) {
                                    duracionMax = Integer.parseInt(datos[4]);
                                    cliente = new ClienteInvitado(id, nombre, email);
                                    ((ClienteInvitado) cliente).setDuracionMax(duracionMax);

                                } else {
                                    cliente = new Cliente(id, nombre, email);

                                }
                                cliente.setActivo(activo);
                                mapaDat.put(id, cliente);
                            }

                        }
                        
                    }
                }
                
            }
            for (Map.Entry<Long, Cliente> ent : mapaDat.entrySet()) {
                            System.out.println("Cli: " + ent.getValue().toString());

                        }
        } catch (Exception ex) {
            System.err.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception ex2) {
                System.err.println("Mensaje al cerrar: " + ex2.getMessage());
            }
        }
    }

}
