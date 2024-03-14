package ActividadesEjemplo;

import java.util.Arrays;

public class copiarArray {
    public static void main(String[] args) {
        //Copiar Array
        int arrayUno[] = new int[5];
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(arrayUno));
        //si se necesita copiar un array
        int arrayDos[]=new int[5];
        arrayDos=Arrays.copyOf(arrayUno,3);
        System.out.println(Arrays.toString(arrayDos));
    //copyOfRange
        //crea y devueleve una tabla donde se copian los elementos indicados en el rango
        //indice desde, donde comienza
        //hasta.. donde termina sin incluir este elemento
        int array3[]=Arrays.copyOfRange(arrayUno,2,4);
        mostrar(Arrays.toString(array3));
        //copiar con un metodo de la clase System-> insertar o borrar un elemento de la tabla
        int array4[]=new int[5];
        System.arraycopy(arrayUno,0,array4,0,arrayUno.length);
        mostrar(Arrays.toString(array4));





    }
    static void mostrar(String texto){
        System.out.println(texto);
    }

}
