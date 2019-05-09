/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Fecha {
    public static void probar(){
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.set(2019, 0, 4);
        System.out.println("Fecha: " + fecha.toString());
        Date fechaDate = fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());
        
        
        GregorianCalendar miCumple;
        miCumple = new GregorianCalendar(2019, 0, 4);
        
        if (miCumple.equals(fecha)){
            System.out.println("Cummpleaños Feliz!");
        }
        else if(miCumple.before(fecha)){
            System.out.println("Ya cumpliste");
        }
        else if (miCumple.after(fecha)){
            System.out.println("Aun no cumples");
        }
    }
    
}
