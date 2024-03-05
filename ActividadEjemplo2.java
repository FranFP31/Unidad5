package ActividadesEjemplo;

import java.util.Arrays;

public class ActividadEjemplo2 {
    public static void main(String[] args) {
        String[] id=new String[5];
        //inicializar con un valor predeterminado un array
        Arrays.fill(id,"Nombre");
        System.out.println("\n"+Arrays.toString(id));
        double[] puntuacion=new double[10];
        Arrays.fill(puntuacion,0);
        //inicializa los valores comprendidos de 0 a 5,con el valor de 55
        Arrays.fill(puntuacion,0,5,55);
        System.out.println(Arrays.toString(puntuacion));
    }
}
