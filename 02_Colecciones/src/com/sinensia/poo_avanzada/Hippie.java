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
public class Hippie extends Animal implements Mamifero{

    public Hippie(String nombre, float tamanho) {
        super(2, true, false, nombre, tamanho, false);
    }

    @Override
    public void mover() {
        System.out.println("Se desplaza en manadas");
    }

    @Override
    public void volar() {
        System.out.println("Cree que su mente vuela");
    }

    @Override
    public void comer() {
        System.out.println("Se alimento de hierba");
        
    }

    @Override
    public String mamar(Mamifero mam) {
       return "El Hippie " + nombre + " mama de " + mam.toString();
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}
