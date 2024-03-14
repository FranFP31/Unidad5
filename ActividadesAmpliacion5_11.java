package ActividadesAmpliacion;

import java.util.Arrays;
import java.util.Scanner;

/**Realizar la funcion:
 * int[] buscarTodos(int t[],int clave)
 * que crea y devuelve una tabla con todos los indices de los elementos donde se encuentra la clave de busqueda.
 * En el caso de que clave no se encuentre en la tabla t, la funcion devolvera una tabla vacia **/
public class ActividadesAmpliacion5_11 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int tabla[]=crearTabla();
        int resultado[]=buscarIndice(tabla);
        mostrar("El resultado encontrado es: " );
        mostrar(Arrays.toString(resultado) );

    }
   static int[] crearTabla(){
       mostrar("Indique el numero de elementos a insertar");
       int longitud=sc.nextInt();
       int tabla[]=new int[longitud];
       for (int i=0;i<tabla.length;i++){
           mostrar("Indique elemento"+(i+1)+"->");
           tabla[i]=sc.nextInt();
       }
       return tabla;
    }
    static int[]buscarIndice(int tabla[]){
        //creamos una tabla donde insertaremos los indices
        int tablaAux[]=new int[0];
        mostrar("Indique el numero a buscar");
        int buscar=sc.nextInt();
        for (int i=0;i<tabla.length;i++){
            if (tabla[i]==buscar){
                tablaAux= Arrays.copyOf(tablaAux,tablaAux.length+1);
                tablaAux[tablaAux.length-1]=i;
            }
        }
        return tablaAux;
    }
    static  void mostrar(String texto){
        System.out.println(texto);
    }
}
