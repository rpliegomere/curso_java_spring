/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ProbandoGenericos {
    
    public static void probarMetodo(){
        int num = 10;
        Integer objNum = new Integer(10);
        num = 11;
        String texto = "" + String.valueOf(num);
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
    
}
