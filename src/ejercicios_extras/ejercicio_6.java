/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
por debajo de 1.60 mts. y el promedio de estaturas en general
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, suma_esta=0, suma_baja =0;
        double prom_total, prom_baja, estatura;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de personas ");
        n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las estaturas");
            estatura = leer.nextDouble();
            suma_esta = suma_esta + estatura;
            
            
        }
        
        
    }
    
}
