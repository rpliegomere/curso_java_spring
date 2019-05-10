/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzada;

/**
 *
 * @author Admin
 */
public class ProbandoAnimales {
    
    public static void ProbrarClasesAbstractas(){
    
    Tucan unTucan = new Tucan("Turigualca", 15.8F);
        System.out.println(unTucan.nombre+":");
        unTucan.comer();
        unTucan.volar();
        unTucan.cazar("conejos");
    unTucan.mover();
        System.out.println("Que mama: " + );
       System.out.println("");
    TortugaNinja donatello = new TortugaNinja("Donatello", 177.3F);
        System.out.println(donatello.nombre + ":");
        donatello.comer();
    donatello.mover();
    donatello.volar();
        System.out.println("");
    Hippie hippie = new Hippie("Hipster", 170.5F);
        System.out.println(hippie.nombre + ":");
    hippie.comer();
    hippie.mover();
    hippie.volar();
        System.out.println("Que mama: " unTucan.mamar(hippie));
    GatoVolador supergato = new GatoVolador("Super Cat", 63F);
        System.out.println(supergato.nombre + ":");
        supergato.comer();
        supergato.mover();
        supergato.volar();
        supergato.saludarAlPropietario();
    
}
    
}
