
package test;   
import dominio.Vehiculo;

/**
 *
 * @author jonat
 */
public class GestionCoches{

    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("33M", "BMW", "z1", "Azul", 1.45, true);
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo("22M");
        
        Vehiculo v [] = {v1,v2,v3};
        
        for(int i=0; i<v.length; i++){
            System.out.println(v[i]);
        }
    }
    
}
