/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 Sobrescribir el metodo geTime()
 * @author Admin
 */
public class FechaSinMinutos {
    
    
    
    public static LocalDate FechaSinMinutos(){
        System.out.println("Fecha: " + LocalDate.now());
        return LocalDate.now();
    }
        
        public static void Comparar(){
            
        LocalDate FechaSin = LocalDate.now();
        
            GregorianCalendar miCumple = new GregorianCalendar(2019, 3, 4);
        if (miCumple.after(FechaSin)){
            System.out.println("Aun no cumples");
        }
        else if(miCumple.before(FechaSin)){
            System.out.println("Ya cumpliste");
        }
        else if(miCumple.equals(FechaSin)){
            System.out.println("Cummpleaños Feliz!");
        }
    }
        
        
}
        
    
 