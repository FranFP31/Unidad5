package ActividadesEjemplo;

import java.util.Arrays;
import java.util.Scanner;

/**Busqueda ordenada Dicotomica **/

public class BusquedaDicotomica {
    public static void main(String[] args) {
        int[] numeros={15,17,12,23,27,18,13,24,25,37,28};
        mostrar("Longitud del array "+numeros.length+" Caracteres");
        mostrar("Sin ordenar");
        mostrar(Arrays.toString(numeros));
        mostrar("Ordenado");
        Arrays.sort(numeros);
        mostrar(Arrays.toString(numeros));
        //despues de ordenar el array, se puede buscar un elemento con la clase binarySearch(nombreArray,elementoAbuscar)
        //el resultado de esta clase es un entero, si es positivo, es el indice donde se encuentra
        //si es negativo menor que cero, es el indice donde deberia ir posicionado ese elemento buscado pero que no se encuentray
        int posicion=Arrays.binarySearch(numeros,8);
        int indiceInsercion=-posicion-1;
        if (posicion>=0){
            mostrar("posicion en el Array -> "+posicion);
        }else {
            mostrar("deberia ir en la posicion : "+indiceInsercion);
        }

    }
    static void mostrar(String texto){
        System.out.println(texto);
    }
    static void mostrarSinLn(String texto){
        System.out.print(texto);
    }

}
