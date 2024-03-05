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
    }

}
