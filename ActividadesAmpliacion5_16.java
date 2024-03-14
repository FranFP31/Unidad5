package ActividadesAmpliacion;

import java.util.Scanner;

/**En un juego de rol el mapa puede implementarse como una matriz donde las filas y las columnas representan
 * lugares (lugar 0, lugar1, lugar2,etc) que estarán conectados. Si desde el lugar X podemos ir hacia el lugar Y,
 * entonces la matriz de la posicion [x][y] valdra cierto; en caso contrario, valdra falso.
 * Escribe una funcion que, dada la matriz que representa el mapa y dos lugares, indique si es posible viajar desde el
 * primer lugar al segundo lugar(directamente o pasando por lugares intermedios)**/

public class ActividadesAmpliacion5_16 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //Mapa de booleanos.
        boolean mapa[][]={
                {true, false, true, false,false},
                {false,true,false,true,false},
                {true,true,false,true,false},
                {false,false,false,true,false},
                {true,true,false,true,false},
        };
       pedirDatos(mapa);

    }

    static void pedirDatos(boolean mapa[][]){
        int x, y;
        do {
            mostrar("Indique la posicion y");
            y = sc.nextInt();
            mostrar("Indique la posicion x");
            x = sc.nextInt();
        }
        while (y<0|| y>4 || x>4 || x<0);
        //creamos un contador, donde mostremos las posiciones que tiene que recorrer en el array
        //para llegar al destino
        int contador=0;
        int puntos=0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                contador++;
                if (i==x&&j==y) {
                    mostrarLn("el resultado es " + mapa[i][j]);
                    mostrarLn("has recorrido " + contador + "Casillas");
                    if (mapa[i][j]){
                        puntos++;
                    }
                    break;
                }
            }
        }
        partida();
    }
    static void partida(){

    }
    static void mostrar(String texto){
        System.out.print(texto);
    }
    static void mostrarLn(String texto){
        System.out.println(texto);
    }
}
