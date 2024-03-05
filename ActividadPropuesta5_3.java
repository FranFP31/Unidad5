package ActividadesPropuestas;

import java.util.Scanner;

/**Introduce por teclado un numero n; a continuacion,solicita que teclee n numeros.
 * Realiza la media de los números positivos, la media de los negativos y cuenta el número de ceros introducidos**/

public class ActividadPropuesta5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta el numero de elementos ->");
       int n=sc.nextInt();
        int numeros[]=new int[n];
        int contadoCero=0;
        int contadorNegativos=0;
        int contadorPositivos=0;
        double mediaPositivos=0;
        double mediaNumTotal=0;
        double mediaNeg=0;
        for (int i=0;i<n;i++){
            mostrar("Inserta el elemento "+(i+1));
            numeros[i]= sc.nextInt();
            if (numeros[i]<0){
                mediaNeg+=numeros[i];
                contadorNegativos++;
            }
            else if (numeros[i]>0){
                mediaPositivos+=numeros[i];
                contadorPositivos++;
            }else {
                contadoCero++;
            }
        }
        mediaPositivos/=contadorPositivos;
        mediaNeg/=contadorNegativos;
        mediaNumTotal=mediaPositivos+mediaNeg;
        if (contadorPositivos!=0){
            mostrar("La media de positivos es de "+mediaPositivos);
        }
        if (contadorNegativos!=0){
            mostrar("La media de negativos  es de "+mediaNeg);
        }
        if (mediaNumTotal==0){
            mostrar("La media total es de " +mediaNumTotal);
        }
        if (contadoCero!=0){
            mostrar("El contador de cero es de " + contadoCero);
        }
        double difTotal=mediaPositivos-mediaNeg;
        mostrar("La diferencia es de "+difTotal);

    }
    static void mostrar(String texto){
        System.out.println(texto);
    }
}
