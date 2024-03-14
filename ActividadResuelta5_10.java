package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Escribir la funcion:
 * in[] eliminarMayores(int t[],int valor)
 * que crea y devuelve una copia de la tabla t donde se han eliminado todos los elementos que son mayores de valor**/

public class ActividadResuelta5_10 {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        mostrar( "Inserta un valor:");
        int valor= sc.nextInt();
        int t[]={1,2,4,54,5,8};
        Arrays.sort(t);
        //ahora recorremos la tabla para calcular la suma de sus elementos
        mostrar("El valor introducido es "+valor+" estos son los valores restantes");
        sinMayores(valor,t);



    }
    static int[] sinMayores(int valor, int t[]){
        int copia[]= Arrays.copyOf(t,t.length);//creamos la copia de t
        int i=0;
        while (i<copia.length){//recorremos la copia
            if (copia[i]>valor){
                //hay que eliminar la copia[i]
                copia[i]=copia[copia.length-1];
                //copiamos el último copia[i]
                copia=Arrays.copyOf(copia,copia.length-1);
                //TablaOrigen, posicionOrigen, tablaDestino,posicionDestino,Longitud
                //ahora tendremos que volver a comprobar copia[i].no modificamos i
            }else {
                i++;//copia[i] se queda en la tabla, comprobaremos copia[i+1]
            }
        }
        mostrar(Arrays.toString(copia));
        return copia;
    }
    static  void mostrar(String texto){
        System.out.println(texto);
    }




}
