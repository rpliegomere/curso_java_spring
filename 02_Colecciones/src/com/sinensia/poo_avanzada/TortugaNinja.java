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
public class TortugaNinja extends Mascota{

    public TortugaNinja(String nombre, float tamanho) {
        super(4, true, true, nombre, tamanho, false);
    }

    @Override
    public void mover() {
        System.out.println("Salto mortal triple con pirueta");
    }

    @Override
    public void volar(){
        System.out.println("Puede volar con jetpack");
    }

    @Override
    public void comer() {
        System.out.println("Come pizza");
    }

    @Override
    public void saludarAlPropietario() {
        System.out.println("hola");
    }
    
}
