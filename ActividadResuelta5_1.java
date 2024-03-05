package ActividadesResueltas;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

/**Crea una tabla de longitud 10 que se inicializara con numeros aleatorios comprendidos entre 1 y 100.
 * Mostrar la suma de todos los números aleatorios que se guardan en la tabla */
public class ActividadResuelta5_1 {
    public static void main(String[] args) {
       int[] num=new int[10];
        int suma=0;
        for (int i=0;i< num.length;i++){
            num[i]=(int)(Math.random()*100+1);
            suma+=num[i];
        }

        System.out.println(Arrays.toString(num));
        System.out.println("La suma de todos los elementos es igual a:"+suma);
        //salida interesante con-> foreach
        for (int elemento:num){ //se declara la variable que la del elemento y que recorre el array.
            System.out.println(elemento);
           // System.out.println("+");
            if (elemento==num.length){
                System.out.println("=");
            }
            System.out.println("+");
        }
        System.out.println("=");
        System.out.println(suma);

    }
}
