/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números 
pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_8 {

    public static void main(String[] args) {

        //boolean salida = true;
        int num, cont = 0, cont_Par = 0, cont_Imp = 0;

        do {
            System.out.println("Ingrese numeros enteros");
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            cont++;
            if (num % 2 == 0 && num % 5 != 0 && num > 0) {
                cont_Par++;
            }
            if (num % 2 == 1 && num % 5 != 0 && num > 0) {
                cont_Imp++;
            }
            if (num % 5 == 0) {
                break;
            }

        } while (num > 0);

        System.out.println("Impares ingresados " + cont_Imp);
        System.out.println("Pares ingresados" + cont_Par);
        System.out.println("Números ingresados " + (cont_Par + cont_Imp));
        System.out.println("Se rompe el ciclo al ingresar un número multiplo de 5 y este último  no se contabiliza");

    }
}
