/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_prueba;

/**
 *
 * @author Admin
 */
public class Clientes {

    private long id;
    private String nombre;
    private String email;
    
    public Clientes(){
    }
    
    
    public Clientes(long id, String nombre, String email){
        this.id=id;
        this.nombre=nombre;
        this.email=email;  
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
public String mostrar(){
    String informacion;
    informacion = "ID: " + id + " | Nombre: " + nombre + " | Email: " + email;
    return informacion;   
    }

@Override
    public String toString() {
    return "ID: "  + id + " | Nombre: " + nombre + " | Email: " + email;
    }
    
}
    

