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
        
        boolean salida = true;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contador = 0;
        
        do
        {
              System.out.println("Ingrese numeros enteros");
              Scanner num_i = new Scanner(System.in);
              int num = num_i.nextInt();
             
            contador++; 
              
            if (num%2==0 && num%5!=0 && num>0)
            {
                contadorPar++;
            }
            
            if (num%2==1 && num%5!=0 && num>0)    
            {
                contadorImpar++;
            }
            
            if (num%5==0)
            {
                salida = false;
               
            }
            
        }while (salida);
        
        System.out.println("los impares son " + contadorImpar);
        System.out.println("los pares son " + contadorPar);
        System.out.println("los ingresos validos son " + (contadorPar+contadorImpar)); 
       
    } 
}