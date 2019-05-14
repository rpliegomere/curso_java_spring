package com.sinensia;

import static com.sinensia.dao.ProbandoDAO.probarCliente;
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzando.ProbandoAnimales;
import com.sinensia.pruebas.Fechas;
import com.sinensia.pruebas.Colecciones;
import static com.sinensia.pruebas.Ficheros.ProbarEscritura;
import static com.sinensia.pruebas.Ficheros.escrituraStream;
import static com.sinensia.pruebas.Ficheros.lecturaFich;
import static com.sinensia.pruebas.Herencia.probandoHerencia;
import com.sinensia.pruebas.Polimorfismo;
import static com.sinensia.pruebas.TratamientoCadenas.pruebasString;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Polimorfismo.polimorfeandoConListas();
        Polimorfismo.clientes.add(new Cliente(7, "Yo", null));
        Polimorfismo.poliformHashMap();*/
        //Colecciones.ejemploListas();
        //Colecciones.ejemploSet();
        
        // Colecciones.ejemploHashMap();
        // ProbandoGenericos.probarMetodo();
        //probarCliente() ;
        /*
        Colecciones.ejemploListas();
        Fechas.probar();
        probandoHerencia();*/
        //ProbandoAnimales.probarClasesAbstractas();
       // ProbarEscritura();
        //scrituraStream();
        //lecturaFich();
        pruebasString();
    }
}
