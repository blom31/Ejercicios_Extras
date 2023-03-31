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
        
        int n, cont_esta = 0, cont_baja = 0 ;
        double prom_total, prom_baja, estatura, suma_esta=0, suma_baja =0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de personas ");
        n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las estaturas");
            estatura = leer.nextDouble();
            suma_esta = suma_esta + estatura;
            cont_esta++;
            
            if (estatura < 1.60) {
            suma_baja = suma_baja + estatura;
            cont_baja++;
                
            }
        }
        
        if (cont_esta > 0) {
            prom_total = suma_esta / cont_esta;
            System.out.println("El promedio general de estaturas es de " + prom_total);
            
        }else {
            System.out.println("No se ingresaron estaturas");
        }
        if (cont_baja > 0) {
            prom_baja = suma_baja / cont_baja;
            System.out.println("El promedio de estaturas menores a 1,60 es de"+ prom_baja);
            
        }else {
            System.out.println("No se ingresaron esturas menor a 1,60");
        }
        
    }
    
}
