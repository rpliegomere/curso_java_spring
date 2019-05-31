
package com.sinensia.api;

import java.util.ArrayList;

public class ServicioProductoSingleton {
    
    private ArrayList<Producto> listaProducto;
    
    public void insertar(Producto p){
        listaProducto.add(p);
    }
    public Producto modificar(Producto p){
        p.setNombre(p.getNombre());
        p.setPrecio(p.getPrecio());
        return p;
    }
    public Producto[] obtenerTodos() {
        return (Producto[]) listaProducto.toArray();
    }
    
    
    private static ServicioProductoSingleton instancia = null;
    
    private ServicioProductoSingleton(){
        
    }
    public static ServicioProductoSingleton getInstancia(){
        if (instancia == null)
            instancia = new ServicioProductoSingleton();
        return instancia;
    }
    
}
