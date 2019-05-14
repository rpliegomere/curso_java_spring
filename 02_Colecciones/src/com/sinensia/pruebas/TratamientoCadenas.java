/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

/**
 *
 * @author Admin
 */
public class TratamientoCadenas {
    public static void pruebasString(){
        String quijote ="En un lugar de la Mancha...";
        if (quijote.contains("Mancha"))
            System.out.println("Contiene Mancha");
        if (quijote.contains("mancha"))
            System.out.println("Contiene mancha");
        if (quijote.contains("manCHa"))
            System.out.println("Contiene manCHa");
        else
            System.out.println("No contiene manCHa");
        if (quijote.toLowerCase().contains("manCHa".toLowerCase()))
            System.out.println("Contiene manCHa - version en minusculas");
        else
            System.out.println("No contiene manCHa");
    }
    
}
