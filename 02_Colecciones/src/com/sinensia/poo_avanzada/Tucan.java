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
public class Tucan extends Animal implements Depredador, Mamifero{
    
    public Tucan(String nombre, float tamanho){
        super(2, true, false, nombre, tamanho, true);
       
    }

    @Override
    public void mover() {
        System.out.println("Volando Voy");
    }

    @Override
    public void volar() {
        System.out.println("Puede Volar");
    }

    @Override
    public void comer() {
        System.out.println("Se alimenta de frutas");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre + " caza " + presa + " con un cuchillo.");
    }

    @Override
    public String mamar(Mamifero mam) {
        return "El Tuncan " + nombre + " mama de " + mam.toString();
    }
    @Override
    public String toString(){
    return nombre;
}
  
}
