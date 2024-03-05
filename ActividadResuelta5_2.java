package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Diseña un programa que solicite al usuario que introduzca por teclado 5 numeros decimales.
 * A continuacion, mostrar los números en el mismo orden que se han introducido**/

public class ActividadResuelta5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double t[]=new double[5];

        for (int i=0;i<5;i++){
            System.out.println("Inserta el "+(i+1) +"numero");
            t[i]= sc.nextDouble();
        }
        System.out.println(Arrays.toString(t));
    }
}
