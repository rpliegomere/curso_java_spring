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
public class GatoVolador extends Mascota{

    public GatoVolador( String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho, true);
    }
    
    

    @Override
    public void mover() {
        System.out.println("Se desplaza para romper cosas");
    }

    @Override
    public void volar() {
        System.out.println("Puede Volar");
    }

    @Override
    public void comer() {
        System.out.println("Se alimenta de pescado");
    }

    @Override
    public void saludarAlPropietario() {
        System.out.println("hola");
    }
    
}
