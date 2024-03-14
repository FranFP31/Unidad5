package ActividadesEjemplo;

import java.util.Arrays;

public class InsertarArray {
    public static void main(String[] args) {
        int [] numeros=new int[6];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=(int) (Math.random()*100+1);
        }
        mostrar("La longitud del Array es: "+numeros);
        mostrar(Arrays.toString(numeros));
        numeros=Arrays.copyOf(numeros,numeros.length +1);
        numeros[numeros.length-1]=8;
        mostrar(Arrays.toString(numeros));
    }
    static void mostrar(String texto){
        System.out.println(texto);
    }
}
