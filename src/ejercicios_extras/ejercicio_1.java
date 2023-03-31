/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int min, dia, hora;
        
       
        System.out.println("Ingrese los minutos");
        min = leer.nextInt();
          
        hora = min / 60;        
        dia = hora / 24;
        hora = hora % 24;
        
        System.out.println(min + " minutos son " + dia + " dias y " + hora + " horas");
        
        
    }
    
}
