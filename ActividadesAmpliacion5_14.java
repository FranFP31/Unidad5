package ActividadesAmpliacion;

import java.util.Arrays;
import java.util.Scanner;

/**El ayuntamiento de tu localidad te ha encargado una aplicacion que ayude a realizar encuestas  estadisticas
 * para conocer el nivel adquisitivo de los habitantes del municipio.
 * Para ello tendras que preguntar el sueldo a cada persona encuestadda.
 * A priori, no  conoces el número de encuestados. Para finalizar la entrada
 * de datos, introduce un sueldo con valor -1.
 * Una vez terminada la entrada de datos, muestra la siguiente informacion:
 * -Todos los sueldos introducidos ordenados de forma decreciente
 * El sueldo minimo y maximo
 * La media de los sueldos**/

public class ActividadesAmpliacion5_14 {
    public static void main(String[] args) {
        double sueldos[]=altaSueldos();
        //llamaos al metodo mostrar decreciente
        mostrarDecreciente(sueldos);
        //mostrar Max y min
        minMax(sueldos);
        //mostrar media
        mediaSueldos(sueldos);
    }
    static  double[] altaSueldos(){
        double sueldos[]=new double[0];
        double sueldoAux=0;
        //declaramos el Scaner
        Scanner sc=new Scanner(System.in);
        //el bucle While que hasta que no se escriba -1 no salga el bucle
       do {
           mostrarSinLn("Indique su sueldo");
           sueldoAux=sc.nextDouble();
           if (sueldoAux!=-1) {
               sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
               sueldos[sueldos.length - 1] = sueldoAux;
           }

        }while (sueldoAux!=-1);
        //enviamos el resultad
        Arrays.sort(sueldos);
        return sueldos;
    }

    //Metodo para mostrar los sueldos de manera decreciente
    static void mostrarDecreciente (double sueldos[]){
        for (int i=sueldos.length-1;i>=0;i--){
            mostrar("El "+sueldos[i]+" - ");
        }
    }
    //Metodo mostrar el Maximo y el Minimo
    static  void  minMax(double sueldos[]){
        mostrar("Sueldo Mayor-> :"+(sueldos[sueldos.length-1]));
        mostrar("Sueldo Menor-> :"+(sueldos[0]));
    }
    //calcular la media
    static void mediaSueldos(double sueldos[]){
        double suma=0;
        for (int i=0;i< sueldos.length;i++){
            suma+=sueldos[i];
        }
        double media=suma/ sueldos.length;
        mostrar("La media de los sueldos es -> "+ media+ " €");
    }

    static void mostrar(String texto){
        System.out.println(texto);
    }
    static void mostrarSinLn(String texto){
        System.out.println(texto);
    }
}
