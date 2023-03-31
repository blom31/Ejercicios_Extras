/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos 
que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a 
pagar por dicho socio.

 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opc;
        int pago, descuento;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su tipo de Afiliación, A , B o C ");
        opc = leer.next();

        if (opc.equalsIgnoreCase("A")) {
            System.out.println("Cuenta con un descuento del 50%");
            System.out.println("Ingrese el monto del tratamiento a realizar");
            pago = leer.nextInt();
            descuento = (pago * 50) / 100;
            descuento = pago - descuento;
            System.out.println("Su importe final es de : " + descuento);

        } else if (opc.equalsIgnoreCase("B")) {
            System.out.println("Cuenta con un descuento del 35%");
            System.out.println("Ingrese el monto del tratamiento a realizar");
            pago = leer.nextInt();
            descuento = (pago * 35) / 100;
            descuento = pago - descuento;
            System.out.println("Su importe final es de : " + descuento);

        } else if (opc.equalsIgnoreCase("C")) {
            System.out.println("Usted no cuenta con ningún desscuento activo");

        } else {
            System.out.println("Tipo de afiliado inválido");

        }
    }
}
