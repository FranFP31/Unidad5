package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Desarrollar el juego "La Cámara Secreta", que consiste en abrir una camara mediante su combinacion secreta,
 * que esta formado por una combinacion de digitos del uno al cinco.
 * El jugador especificará cuál es la longitud de la conbinacion:
 * a mayor longitud, mayor sera la dificultad del juego.
 * La aplicacion genera de forma aleatoria, una combinacion secreta que el usuario tendra que acertar.
 * En cada intento se muestra como pista, para cada digito de la combinacion introducido por el jugador si es mayor, menor
 * o igual que el correspondiente en la combinacion secreta.**/

public class ActividadResuelta5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrar("Introduzca la longitud de la combinacion");
        int longitud = sc.nextInt();
        int combSecreta[] = new int[longitud];//combinacion secreta
        int combPlayer[] = new int[longitud];//combinacion del jugador
        //generamos aleatoriamente la combinacion secreta
        combSecreta(combSecreta);
        //comprobamos la combinacion secreta
        mostrar(" " + Arrays.toString(combSecreta));
        mostrar("Escriba una combinacion");
        leerTabla(combPlayer);
        while (!Arrays.equals(combSecreta, combPlayer)) {//si no son iguales
            muestraPistas(combSecreta, combPlayer);//mostramos las pistas
            mostrar("Escriba una combinacion");
            leerTabla(combPlayer);
        }
        //salir del while significa que hemos acertado la combinacion secreta
        mostrar("Enhorabuena has ganado una aceituna");

    }

    static void mostrar(String texto) {
        System.out.println(texto);
    }


    static void combSecreta(int t[]) {
        /**Esta funcion inicializa los valores de la tabla t con los valores aleatorios.
         * La constante MAX determina el valor maximo que asigna a un elemento, esta comprendido entre
         * el rango 1...MAX**/
        final int max = 5;//rango del 1 a Max
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * max + 1);
            /**Número aleatorio de 1 a max
             * t referencia a la tabla combSecreta del programa principal.
             * Por este motivo asignar un valor a t[i] es lo mismo que hacerlo en combSecreta[i]**/
        }

    }

    static void leerTabla(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            mostrar("introduce el  digito "+(i+1)+" de la combinacion");
            t[i] = sc.nextInt();
            /**Recorre las dos tablas, combSecreta  y combPlayer e indica para cada elemento de la
             * combinacion introducida por el usuario si es mayor, menor o igual que el equivalente
             * en la combinacion secreta**/
        }
    }

    static void muestraPistas(int secreta[], int combPlayer[]) {
        mostrar("Pistas:");
        for (int i = 0; i < combPlayer.length; i++) {
            System.out.println(combPlayer[i]);
            if (secreta[i] > combPlayer[i]) {
                //comprobamos si el i-esimo elemento de ambas
                mostrar("el digito es Mayor");
            } else if (secreta[i] < combPlayer[i]) {
                mostrar("el digito es Menor");
            } else {
                mostrar("Es IGUAL ES IGUAL!!!!!");
            }
        }
    }
}


