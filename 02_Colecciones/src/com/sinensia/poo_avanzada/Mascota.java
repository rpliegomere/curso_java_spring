/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzada;

import com.sinensia.Cliente;


public abstract class Mascota extends Animal{
    
    protected Cliente propietario;

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
    public Mascota(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho, boolean volador){
        super(patas, aerobico, acuatico, nombre, tamanho, volador);
    }
    
    public void pedirComida(){
        System.out.println(propietario.getNombre() +"ALIMENTAME!!");
    }
    
    public abstract void saludarAlPropietario();
            
    
}
