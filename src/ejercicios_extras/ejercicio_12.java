/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package ejercicios_extras;

/**
 *
 * @author blom3
 */
public class ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i, j, k;
        String ci,cj,ck;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                for (k = 0; k < 5; k++) {
                    
                        ci=String.valueOf(i);
                        cj=String.valueOf(j);
                        ck=String.valueOf(k);
                        
                    if (ci.contains("3")|| cj.contains("3")|| ck.contains("3")) {
                        ci=ci.replace("3","E");
                        cj=cj.replace("3","E");
                        ck=ck.replace("3","E");
                        
                    }
                    System.out.println(ci + " - " + cj + " - " + ck);

                }

            }
        }

    }
}

/*for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
            if (i == 3) {
                System.out.print("E-");
            } else if (j == 3) {
                System.out.print(i + "-E-");
            } else if (k == 3) {
                System.out.print(i + "-" + j + "-E");
            } else {
                System.out.print(i + "-" + j + "-" + k);
            }
            System.out.println();
        }
    }
}*/