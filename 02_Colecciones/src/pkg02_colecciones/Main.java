
package pkg02_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Main {


    public static void main(String[] args) {
        ejemploHashMap();
      
    }
    
    
    static void ejemploHashMap(){
        
        HashMap<String, Cliente> diccCliente;
        diccCliente = new HashMap<String, Cliente>();
        Cliente ana = new Cliente(1, "Ana", 'M', null, null);
        Cliente luis = new Cliente(2, "Luis", 'H', null, null);
        Cliente bea = new Cliente(3, "Bea", 'M', null, null);
        
        diccCliente.put("a1", ana);
        diccCliente.put("b2", luis);
        diccCliente.put("c3", bea);
        
        System.out.println("Bea? " + diccCliente.get("c3").getNombre());
        
        for (Map.Entry<String, Cliente> parClaveValor : diccCliente.entrySet()){
        
        System.out.println("Cliente " + parClaveValor.getKey());
        Cliente cliente = parClaveValor.getValue();
            System.out.println(" Nombre: " + cliente.getNombre());
        }
        
    }
    
    static void ejemploLista() {
        
        ArrayList<Cliente> listaCliente;
        listaCliente = new ArrayList();
        
        listaCliente.add(new Cliente(1, "Ana", 'M', null, null));
        listaCliente.add(new Cliente(2, "Luis", 'H', null, null));
        listaCliente.add(new Cliente(3, "Bea", 'M', null, null));
        
        listaCliente.remove(1);
        Cliente bea = listaCliente.get(1);
        bea.setEmail("bb@bb.com");
        
        for (int i = 0; i < listaCliente.size(); i++){
            System.out.println("Cliente " + i + ": "
            +listaCliente.get(i).getNombre() + listaCliente.get(i).getEmail());
            
        }
        for (Cliente cliente : listaCliente){
            
            System.out.println("Cliente: " + cliente.getNombre() + ",  Email: " + 
                    cliente.getEmail());
        }
    }
    
}
