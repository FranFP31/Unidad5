package ActividadesResueltas;
/**Escribir una app que solicite al usuario cuantos números desea introducir.
 * A continuacion, introducir por teclado esa cantidad de números enteros, y por ultimo,
 * mostrar el orden inverso al introducido**/
import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int longitud;
        System.out.print("Cuantos numeros desea introducir->");
         longitud=sc.nextInt();
         int numeros[]=new int[longitud];
         for (int i=0;i<numeros.length;i++){
             mostrar("Indique el numero->");
             numeros[i]= sc.nextInt();
         }
         mostrar("*****************");
         for (int i=numeros.length-1;i>=0;i--){
             mostrar(numeros[i]+", ");
         }
    }
    static  void mostrar(String texto){
        System.out.println(texto);
    }
}
