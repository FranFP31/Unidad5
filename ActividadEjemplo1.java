package ActividadesEjemplo;
import java.util.Arrays;
import java.util.Scanner;
/**Arrays de programacion**/
public class ActividadEjemplo1 {

    public static void main(String[] args) {
        //la declaracion del arrray o tabla debe contener tres elementos;
        //1 el tipo de dato
        //2 el nombre de la variable
        //3 la longitud
        int[] edad=new int[5]; //declaracion del array
        edad[0]=23;
        edad[1]=52;
        edad[2]=18;
        edad[3]=32;
        edad[4]=45;
        //System.out.println((Arrays.toString(edad)));//con este sout tira todos los valores almacenados en el array
        //System.out.println((Arrays.toString(new int[]{edad[4]})));//de esta manera me tira el valor especifico que esta en la posicion solicitada
        //System.out.println((Arrays.toString(new int[]{edad[4 - 2]})));//de esta manera nos toma el valor de la resta que esta almacenado en el array
        //Ejemplo solicitar con Scanner las edades
        //solicitar la 1º edad
        Scanner sc=new Scanner(System.in);
        mostar("Indique el numero de edades a mostar");
        int longitud=sc.nextInt();//aqui acumulamos el numero de edades que van a formar el array
        byte[] edades=new byte[longitud];//creamos el array con la longitud leida.
        //necesitamos preguntar las edades para ello vamos a crear un bucle for sencillo para
        //que recorra las posiciones del array y inserte los valores en cada posicion
        for (int i=0;i<longitud;i++){
            mostar("Indique la edad numero "+(i+1));
             edades[i]=sc.nextByte();
        }
        //System.out.println(Arrays.toString(edades));
       //bucle foreach: es un bucle para recorrer tablas.
        for (int ed:edades){ //se declara la variable que la del elemento y que recorre el array.
            System.out.println(" edad insertada->:"+ed);
        }

        //metodos o funciones de la API de java sobre los arrays
        //conocer la longitud de un array
        mostar("Longitud del array edades->"+edades.length);//aqui imprimiria la longitud del array
        mostar("Longitud del array edad->"+edad.length);//aqui imprimiria la longitud del array
        for (int i=0;i<edad.length;i++){
            mostar("La edad insertada en la poscion:"+(i+1)+". Es->"+edad[i]);
        }
        //Referencias en los arrays, variables,etc
        mostar("************REFERENCIAS DE MEMORIA *************");
        System.out.println(edad);
        System.out.println(edades);


    }
    static  void mostar(String texto){
        System.out.println("\t"+texto);
    }

}
