package ActividadesAmpliacion;

import java.util.Arrays;
import java.util.Scanner;

/**Escribe la funcion
 * void desordenar (int t [])
 * que cabia de forma aleatoria los contenidos de la tabla t.
 * Si la tabla estuviera ordenada, dejaria de estarlo **/
public class ActividadesAmpliacion5_13 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int tabla[]=crearTabla();
        mostrar("La tabla original"+Arrays.toString(tabla));
        mostrar("La tabla desordenada"+Arrays.toString(deshordenar(tabla)));


    }
   static int[] crearTabla(){

       mostrar("Indique el numero de elementos a insertar");
       int longitud=sc.nextInt();
       int tabla[]=new int[longitud];
       for (int i=0;i<tabla.length;i++){
           mostrar("Indique elemento"+(i+1)+"->");
           tabla[i]=sc.nextInt();
       }
       Arrays.sort(tabla);
       return tabla;


    }
    //metodo desordenar
    //Mediante un bucle de reccorrido por toda la tabla
    //Random con dos valores con multiplicador por la longitud de la tabla
    //valor 1/valor2 =Random*tabla.length
    //var aux= valor1
    //valor1=valor2
    //valor2=aux
    static int[]  deshordenar(int tabla[]){
        for (int i=0;i< tabla.length;i++){
            int valor1=(int)(Math.random()*tabla.length);
            int valor2=(int)(Math.random()* tabla.length);
            int aux=tabla[valor1];
            tabla[valor1]=tabla[valor2];
            tabla[valor2]=aux;
        }
        int tablaDesordenada[]=Arrays.copyOf(tabla,tabla.length);
        return tablaDesordenada;

    }

    static  void mostrar(String texto){
        System.out.println(texto);
    }
}
