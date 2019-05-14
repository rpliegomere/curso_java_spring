/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ClienteDAO implements InterfazDAO<Cliente>{
    HashMap<Long, Cliente> mapa;
    
    public ClienteDAO(){
        mapa = new HashMap<>();
        
    }
    @Override
    public void poner(Cliente cli){
        if (cli == null){
            System.err.println("No se puede añadir nulos");
        }else{
        mapa.put(cli.getId(), cli);
        }
    }
    
    @Override
    public Cliente leerUno(long id){
        if (mapa.containsKey(id)){
            return mapa.get(id);
        }else{
        System.out.println("Clave/Id no encontrada" + id);
        return null;
        }
    }

    @Override
    public void eliminar(Cliente valor) {
        mapa.remove(valor.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
        
    }

    @Override
    public List<Cliente> leerTodos() {
        ArrayList<Cliente> lista = new ArrayList<>(mapa.values()); 
        
        return lista;
    }

   
    @Override
    public void modificar(Cliente modCli) {
        if (modCli == null){
            System.err.println("No se puede añadir nulos");
        }else{
        mapa.put(modCli.getId(), modCli);
        }
     
        }
        
    

   

  
}
