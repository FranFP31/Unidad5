package ActividadesEjemplo;

import java.util.Scanner;

public class BusquedaNoOrdenada {
    public static void main(String[] args) {
        int[] numeros={5,3,7,977,3,6,8,1,4,97,44};
       // mostrar("Longitud"+numeros.length);
        int indice=0;
        Scanner sc=new Scanner(System.in);
        mostrar("Inserte un numero");
        int numBuscado= sc.nextInt();
        while (indice<numeros.length && numeros[indice]!=numBuscado){//cuando se cumplan las dos condiciones se para el bucle
            indice++;
        }
        //mostrar("La posicion del número buscado es "+indice);
        if (indice<numeros.length){
            mostrar("La posicion es "+indice);
        }else {
            mostrarErr("No existe ese numero ");

        }

    }
    static void mostrar(String texto){
        System.out.println(texto);
    }
    static void mostrarErr(String texto){
        System.err.println(texto);
    }
}

