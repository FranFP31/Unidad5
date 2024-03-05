package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Definir una funcion que tome como parametros dos tablas, la primera con los 6 numeros de una apuesta de la primitiva
 *y la segunda(ordenada) con los números de la convinacion ganadora.  La funcion devolvera el número de aciertos **/

public class ActividadResuelta5_6 {
    public static void main(String[] args) {
       int apuesta []=new int[6];
       int combinacion[]= new int[6];
       int numero;

       for (int i=0;i<6;i++){
            numero=(int)(Math.random()*49+1);
           //si el random duplica un numero en la primitiva eso se da, por lo que hay que validar.
           int indice=0;
           while (indice<combinacion.length && combinacion[indice]!=numero){
               indice++;
           }
           if (indice>=combinacion.length){
               combinacion[i]=numero;
           }else {
               i--;
           }

       }
       Scanner sc=new Scanner(System.in);

           for (int i = 0; i< apuesta.length; i++){
               mostrarErr("Indica tu apuesta: ");
               apuesta[i]= sc.nextInt();
           }
        mostrar("Sus aciertos han sido: "+ primitiva(apuesta,combinacion));
           mostrar("Tus numeros son: "+Arrays.toString(apuesta));
           mostrar("La combinacion ganadora ha sido"+Arrays.toString(combinacion));

    }
    static  void  mostrar(String texto){
        System.out.println(texto);
    }
    static  void mostrarErr(String texto){
        System.out.print(texto);
    }
    static int primitiva(int apuesta[],int combinacion[]){
        int aciertos=0;
        Arrays.sort(apuesta);
        Arrays.sort(combinacion);
        for(int ele:apuesta){
            //como la tabla ganadora esta ordenada utilizamos el binarySearch
            if (Arrays.binarySearch(combinacion,ele)>=0){
                aciertos++;//cada acierto sube a este marcador.
            }
        }
        return aciertos;


    }

}
