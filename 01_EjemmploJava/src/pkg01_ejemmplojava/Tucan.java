
package pkg01_ejemmplojava;


public class Tucan {
    
    String[] colores;
    float longitud;
    int edad;
    
    public Tucan(){
    this.edad = 0;
    longitud = 5f;
    colores = new String[] {
        "Verde", "Morado"
    };
    }
    
    
    public void piar(){
        System.out.println("pio pio " + edad + " años");
    }
    
    
}
