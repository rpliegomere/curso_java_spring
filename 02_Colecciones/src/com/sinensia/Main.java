package com.sinensia;

<<<<<<< HEAD
import com.sinensia.dao.ProbandoDAO;
=======
import static com.sinensia.dao.ProbandoDAO.probarCliente;
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzando.ProbandoAnimales;
import com.sinensia.pruebas.Fechas;
import com.sinensia.pruebas.Colecciones;
import static com.sinensia.pruebas.Herencia.probandoHerencia;
import com.sinensia.pruebas.Polimorfismo;

public class Main {

    public static void main(String[] args) {
        /*Polimorfismo.polimorfeandoConListas();
        Polimorfismo.clientes.add(new Cliente(7, "Yo", null));
        Polimorfismo.poliformHashMap();*/
        //Colecciones.ejemploListas();
        //Colecciones.ejemploSet();
<<<<<<< HEAD
        //Colecciones.ejemploHashMap();
        /*Colecciones.ejemploListas();
        Fechas.probar();
        probandoHerencia();*/
       // ProbandoAnimales.probarClasesAbstractas();
       //ProbandoGenericos.probarMetodo();
        ProbandoDAO.probarCliente();
=======
        
        // Colecciones.ejemploHashMap();
        // ProbandoGenericos.probarMetodo();
        probarCliente() ;
        /*
        Colecciones.ejemploListas();
        Fechas.probar();
        probandoHerencia();*/
        //ProbandoAnimales.probarClasesAbstractas();
>>>>>>> 7c55dc11ac120a54c6a5d79a41fb6dbded101b8e
    }
}
