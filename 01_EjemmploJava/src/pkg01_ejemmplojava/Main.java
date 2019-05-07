/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejemmplojava;

import java.util.Arrays;


public class Main {

 
    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true;
        if (3 > 5) {
            System.out.println("Es verdadero");
        }
        
        else if (5>7){
            System.out.println("No se ejecuta");
        }
        
        else if (8>9){
            System.out.println("No se ejecuta");
        }
        
        else {
            System.out.println("Lo que sea");
        }
        
        Tucan miPajaro;
        miPajaro = new Tucan();
        miPajaro.longitud = 20.5F;
        miPajaro.edad=3;
        
        
        Tucan otroPajaro;
        otroPajaro = new Tucan();
        otroPajaro.longitud=15.2F;
        otroPajaro.edad=2;
        
        
        System.out.println("Mi Tucan mide " + miPajaro.longitud +
                            " cm. y tiene " + miPajaro.edad + " años");
                            
        System.out.println("El otro Tucan mide " + otroPajaro.longitud +
                            " cm. y tiene " + otroPajaro.edad + " años");
        
        
        otroPajaro.piar();
        miPajaro.piar();
        
        
        
        
        Tucan nuevoTucan = new Tucan();
        
        System.out.println("Nuevo Tucan " + nuevoTucan.edad);
        
        Tucan remasterTucan = new Tucan();
        System.out.println("Tucan 2.0 " + remasterTucan.edad);
        
    }
    
}
