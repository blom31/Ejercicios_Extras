/*
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y l
os valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejercicios_extras;

/**
 *
 * @author blom3
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B, C, D, E;
        
        A= 1;
        B = 2;
        C =3;
        D = 4;
        
        System.out.println("A = " + A + " // B = " + B + " // C = " + C + " // D = " + D);

        //B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B 
        E = B; //2
        B = C; //3
        C = A; // 1
        A = D; // 4
        D = E; //2
        
        System.out.println("B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B");
        System.out.println("A = " + A + " // B = " + B + " // C = " + C + " // D = " + D);
    }
    
}
