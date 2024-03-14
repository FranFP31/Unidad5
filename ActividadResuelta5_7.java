package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Implementar la funcion:
 * int[] sinRepetidos(int t[])
 * que construye y devuelve una tabla de la longitud apropiada, con los elementos de "t",
 * donde se han eliminado los datos repetidos**/
public class ActividadResuelta5_7 {
    public static void main(String[] args) {
        int valores[]={1,5,2,3,1,2,6};
        Arrays.sort(valores);
        //ahora recorremos la tabla para calcular la suma de sus elementos
        mostrar(Arrays.toString(valores));
        int sinRepetidos[]=sinRepetidos(valores);
        mostrar("Los valores son"+Arrays.toString(sinRepetidos));
    }
       static int buscar(int []t, int elemento){
        int pos;
        int i=0;
        while (i<t.length&& t[i]!=elemento){
            i++;
        }
        if (i<t.length){
            pos=i;
        }else {
            pos=-1;
        }
       return pos;
    }
    static int[] sinRepetidos(int[] t){
        int temporal[]=new int[0];//creamos con longitud 0
        for (int elemento:t){
           if (buscar(temporal, elemento)==-1){
                //si no está: insertamos algoritmo de insercion
                temporal= Arrays.copyOf(temporal,temporal.length+1);
                temporal[temporal.length-1]=elemento;
                //lo añadimos al final
            }
        }
        return temporal;
    }
    static void mostrar(String texto){
        System.out.println(texto);
    }
}
