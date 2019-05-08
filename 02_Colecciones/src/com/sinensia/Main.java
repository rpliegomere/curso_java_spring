
package com.sinensia;

import com.sinensia.pruebas.Fecha;
import com.sinensia.pruebas.Colecciones;
import static com.sinensia.pruebas.Colecciones.probandoHerencia;
import static com.sinensia.pruebas.FechaSinMinutos.Comparar;
import static com.sinensia.pruebas.FechaSinMinutos.FechaSinMinutos;




public class Main {


    public static void main(String[] args) {
        
        Colecciones.ejemploHashMap();
        Colecciones.ejemploLista();
        Fecha.probar();
        probandoHerencia();
        FechaSinMinutos();
        Comparar();
    }
         
}