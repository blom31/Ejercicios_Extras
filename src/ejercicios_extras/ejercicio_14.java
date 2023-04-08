/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
para averiguar la media de edad de los hijos de todas las familias.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m,edad,acum=0,media,  cont=0;
        
        System.out.print("Ingrese el número de familia: ");
        n=leer.nextInt();
         
        
            for (int i = 1; i <= n; i++) {
            System.out.print("Familia " + i + " cuantos hijos tienen: ");
            m = leer.nextInt();
                for (int j = 0; j < m; j++) {
                    System.out.print("Indique la edad del hijo "+ (j+1)+"--> ");
                    edad = leer.nextInt();
                   
                    cont++;
                    acum=acum+edad;
                }
                System.out.println("");
            }
            media= acum/cont;
            System.out.println("La media de todos los hijos de las " + n + " familias es de " +media);
        
            
        }
        
    }


