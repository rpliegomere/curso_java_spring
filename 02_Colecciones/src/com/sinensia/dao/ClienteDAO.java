/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
=======

package com.sinensia.dao;

import com.sinensia.Cliente;
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
import java.util.HashMap;
import java.util.List;

/**
 *
<<<<<<< HEAD
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
        
=======
 * @author Admin - German
 */
public class ClienteDAO implements InterfazDAO<Cliente>{
    HashMap<Long, Cliente> mapa;
    public ClienteDAO() {
        mapa = new HashMap<>();
    }
    @Override
    public void poner(Cliente cli) {
        if (cli == null) {
            System.err.println("No se pueden añadir nulos");
        } else {
            mapa.put(cli.getId(), cli);
        }
    }
    @Override
    public Cliente leerUno(long id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }
    @Override
    public void eliminar(Cliente cliente) {
        mapa.remove(cliente.getId());
    }
    @Override
    public void eliminar(long id) {        
        mapa.remove(id);
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
    }

    @Override
    public List<Cliente> leerTodos() {
<<<<<<< HEAD
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
        
    

   

  
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
}
