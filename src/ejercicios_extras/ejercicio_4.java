/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 1 y 10 para mostrar su equivalente en Números Romanos");
        num = leer.nextInt();
        
        if (num>10) {
            System.out.println("Número mayor a 10");            
        } else {
        
        switch (num) {
            case 1:
                System.out.println("Su equivalente es I");
                break;
            case 2:
                System.out.println("Su equivalente es II");
                break;
            case 3:
                System.out.println("Su equivalente es III");
                break;
            case 4:
                System.out.println("Su equivalente es IV");
                break;
            case 5:
                System.out.println("Su equivalente es V");
                break;
            case 6:
                System.out.println("Su equivalente es IV");
                break;
            case 7:
                System.out.println("Su equivalente es VII");
                break;
            case 8:
                System.out.println("Su equivalente es VIII");
                break;
            case 9:
                System.out.println("Su equivalente es IX");
                break;
            case 10:
                System.out.println("Su equivalente es XX");
                break;

        }
    }
    }

}
