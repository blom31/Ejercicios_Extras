/*Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados
 */

/**
 *
 * @author blom3
 */
public class ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 123456789, cant;
       
        cant = num % 10;
        
        System.out.println("la cantidad de cifras es "+ cant );
        
    }
    
}
