/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ficheros {

    public static void ProbarEscritura() throws IOException {
        String[] lineaTexto = {
            "Linea Primera",
            "Linea Segunda",
            "Linea Tercera"};

        FileWriter fichero = null;
        try {
            fichero = new FileWriter("fichero_texto.txt");
            for (int i = 0; i < 4; i++) {

                for (String linea : lineaTexto) {
                    fichero.write(linea + "\r\n");
                }
            }

        } catch (Exception ex) {
            System.err.println("Mensaje error: " + ex.getMessage());
        } finally {
            fichero.close();
            System.out.println("Fichero Cerrado");
        }
    }

    public static void escrituraStream() {

        String[] lineaTexto = {
            "Linea Primera",
            "Linea Segunda",
            "Linea Tercera"};

        Writer out = null;
        try {
            FileOutputStream streamFich;
            streamFich = new FileOutputStream("fich_2.txt");
            OutputStreamWriter streamWriter;
            streamWriter = new OutputStreamWriter(streamFich, "UTF-8");
            out = new BufferedWriter(streamWriter);

            for (int i = 0; i < 4; i++) {

                for (String linea : lineaTexto) {
                    try {

                        out.write(linea + "\r\n");
                    } catch (IOException ex) {
                        System.err.println("Error al escribir fich: " + ex.getMessage());
                    }
                }
            }

        } catch (UnsupportedEncodingException | FileNotFoundException ex2) {

            System.err.println("Error 2: " + ex2.getMessage());
        } finally {
            try {
                out.close();
                System.out.println("Fichero Cerrado");
            } catch (IOException ex3) {
                System.err.println("Error en cierre fich: " + ex3.getMessage());
            }

        }

    }

    public static String lecturaFich() {
        File fichFormWin = new File("C:\\Users\\Admin\\Desktop\\Curso_java\\GitHub German\\curso_java_spring\\02_Colecciones\\fichero_texto.txt");
        // File fichFormJava = new File("C:/Users/Admin/Desktop/Curso_java/GitHub German/curso_java_spring/02_Colecciones/fichero_texto.txt");
        //File fichFormRelativa = new File("fichero_texto.txt");

        Scanner escanear = null;
        try {
            System.out.println("Leyendo fich");
            escanear = new Scanner(fichFormWin);
            while (escanear.hasNextLine()) {
                String linea = escanear.nextLine();
                System.out.println(">>>>> \"" + linea + "\"");

                /* if (linea.compareTo("Linea Tercera") <0);
                else if (linea.compareTo("Linea Tercera") >0);
                else System.out.println(linea);*/
                if (linea.compareTo("Linea Segunda") == 0) {
                    System.out.println(linea);
                }

            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escanear != null);
                escanear.close();
            } catch (Exception ex) {
                System.err.println("Mensaje al cerrar: " + ex.getMessage());
            }
        }
        return null;

    }

}
