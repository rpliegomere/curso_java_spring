/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import java.util.List;

/**
<<<<<<< HEAD
 *
=======
 * Interfaz Data Access Object para toda la app
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
 * @author Admin
 * @param <T> Entidad para interfaz DAO
 */
public interface InterfazDAO<T> {
<<<<<<< HEAD
=======
    
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
    void poner(T valor);
    T leerUno(long id);
    List<T> leerTodos();
    void eliminar(T valor);
    void eliminar(long id);
<<<<<<< HEAD
    void modificar(T nuevoValor);
    
=======
    void modificar(/*long id,*/ T nuevoValor);
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
}
