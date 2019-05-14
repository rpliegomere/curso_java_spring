/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
=======

>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
<<<<<<< HEAD
 * @author Admin
 */
public class ProbandoGenericos {
    
    public static void probarMetodo(){
=======
 * @author Admin - German
 */
public class ProbandoGenericos {
    
    public static void probarMetodo() {
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
        int num = 10;
        Integer objNum = new Integer(10);
        num = 11;
        String texto = "" + String.valueOf(num);
<<<<<<< HEAD
        String texto2 = "" +objNum.toString();
        
        ArrayList<Integer> listaInt = new ArrayList<>();
        insertarDoubleGenerico(listaInt, 10);
        insertarDoubleGenerico(listaInt, 15);
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList<String> listaStr = new ArrayList<>();
        insertarDoubleGenerico(listaStr, "Texto1");
        insertarDoubleGenerico(listaStr, "Texto2");
        System.out.println("Cadenas: " + listaStr.toString());
        
        ArrayList<Date> listaDate = new ArrayList<>();
        insertarDoubleGenerico(listaDate, new Date(88, 4, 10));
        insertarDoubleGenerico(listaDate, new Date(84, 9, 20));
        System.out.println("Fechas: " + listaDate.toString());
        
    }
    
    public static<Tipo> void insertarDoubleGenerico(ArrayList<Tipo> lista, Tipo valor){
        lista.add(valor);
        lista.add(valor);        
    }
    
    public static void insertarDouble(ArrayList<Integer> lista, int valor){
        lista.add(valor);
        lista.add(valor);
    }
    
    public static void insertarDouble(ArrayList<String> lista, String valor){
        lista.add(valor);
        lista.add(valor);
    }
    
=======
        String texto2 = "" + objNum.toString();
        
        ArrayList<Integer> listaInt = new ArrayList<>();
        insertarDobleGenerico(listaInt, 10);
        insertarDobleGenerico(listaInt, 15);
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList<String> listaStr = new ArrayList<>();
        insertarDobleGenerico(listaStr, "texto 1");
        insertarDobleGenerico(listaStr, "texto 2");
        System.out.println("Cadenas: " + listaStr.toString());
        
        ArrayList<Date> listaDate = new ArrayList<>();
        insertarDobleGenerico(listaDate, new Date(82, 4, 10));
        insertarDobleGenerico(listaDate, new Date(84, 9, 20));
        System.out.println("Fechas: " + listaDate.toString());
        
        ArrayList<Double> listaDouble = new ArrayList<>();
        insertarDobleGenerico(listaDouble, new Double(2.55));
    }
    public static<Tipo> void insertarDobleGenerico
            (ArrayList<Tipo> lista, Tipo valor) {
        lista.add(valor);
        lista.add(valor);
    }
    public static void insertarDoble(ArrayList<Integer> lista, int valor) {
        lista.add(valor);
        lista.add(valor);
    }
    public static void insertarDoble(ArrayList<String> lista, String valor) {
        lista.add(valor);
        lista.add(valor);
    }
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
}
