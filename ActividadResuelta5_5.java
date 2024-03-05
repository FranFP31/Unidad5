package ActividadesResueltas;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

/**Escribir la funcion
 * int[] rellenaPares(int lingitud,int fin)
 * que crea y devuelve una tabla ordenada con numeros pares aleatorios comprendidos en el rando desde 2 hasta fin(inclusive)**/

/**Orddenar un array, se modifica el Array....
 * se ordena de forma creciente
 * los datos pueden ser primitivos (numeroricos)
 * La funcion para ordenar es "Array,sort(nombre del Array" con esta funcion se modifica y se ordena
 * en el caso de el Array {5,8,7,1,3,9,15} seria [1,3,5,7,8,9,15]
 * ordenar tipos no primitivos (String)
 * String nombres[]={"Maria,Ana,Beatriz,Xiomara,arancha} se ordenaria de esta manera
 *Arrays.sort(nombres) seria nombres[Ana,Beatriz,Maria,Xiomara, arancha] primero se ordenan las mayusculas y luego las minusculas**/

public class ActividadResuelta5_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        mostrar("Inserte la longitud de la tabla");
        int longitud= sc.nextInt();
        mostrar("Cual va a ser el numero maximo");
        int fin= sc.nextInt();
        rellenarPares(longitud,fin);

    }
    static int []rellenarPares(int longitud,int fin){
        int i=0;
        int pares[]=new int[longitud];
        while (i<pares.length){
            int num=(int)(Math.random()*fin+1);
            if (num%2==0){
                pares[i]=num;
                i++;
            }
        }
        Arrays.sort(pares);
        mostrar("La tabla ordenada es: "+Arrays.toString(pares));
        return (pares);

    }
    static  void mostrar(String texto){
        System.out.println(texto);
    }

}
