/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package ejercicios_extras;

import java.util.Scanner;

/** //ctrl+space
 *
 * @author blom3
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String letra;
        System.out.println("Ingrese una vocal");
        letra = leer.next();
          if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") 
                  || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                  || letra.equalsIgnoreCase("u")) {
          } else {
              System.out.println("No es Vocal");
    
    }
    }
    
}
