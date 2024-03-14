package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Leer y almacenar n numeros enteros en una tabla, a partir de la
 * que se contruiran otras dos tablas con los elementos con valores pares
 * e impares de la primera, respectivamente. Las tablas pares e impares deben mostrarse
 * ordenadas**/
public class ActividadResuelta5_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /**Como las tablas con los num pares e impares tienen que estar ordenadas
         * lo que haremos será ordenar los datos de entrada. Que recorremos y, segun sea
         * par o impar, se insertara en la tabla correspondiente**/
        int datos[];
        int par[]=new int[0];
        int impar[]=new int[0];
        mostar("Escriba n numeros");
        int n=sc.nextInt();
        datos=new int[n];

        //leemos por teclado los valores de la tabla
        for (int i=0;i<datos.length;i++){
            mostar("Introduzca un numero");
            datos[i]=sc.nextInt();
        }
        //recordemos los datos para clasificarlos
        for (int numero:datos){
            //al estar la tabla con todos los datos ordenados,los elementos
            //se insertaran siempre al fial de la tabla par o impar.
            if (numero%2==0){ //si el numero es par
                par= Arrays.copyOf(par,par.length+1);//incremento la longitud del array par
                par[par.length-1]=numero;//guardo el numero en el array de par
            }else {
                impar=Arrays.copyOf(impar,impar.length+1);
                impar[impar.length-1]=numero;
            }
        }
        mostar("Pares"+Arrays.toString(par));
        mostar("Impares"+Arrays.toString(impar));
    }
    static void mostar(String texto){
        System.out.println(texto);
    }
}
