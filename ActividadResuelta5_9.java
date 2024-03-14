package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**Diseñar una aplicacion para gestionar un campeonato de programacion, donde se introduce la puntuacion (enteros)
 * obtenidos por 5 programadores, conforme van terminando su prueba. La aplicacion debe mostrar las puntuaciones
 * ordenadas de los 5 participantes.
 * En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al campeonato programadores de exhibicion
 * cuyos puntos se incluyen con el resto.
 * La forma de especificar que no intervienen mas programadores de exhibicion es introducir como puntuacion -1.
 * La aplicacion debe mostrar, finalmente los puntos ordenados de todos los participantes **/

public class ActividadResuelta5_9 {
    /**Leeremos las puntuaciones en el orden en el que terminen los participantes y las ordenaremos.
     * A continuacion, realizaremos una insercion ordenada(por cada programador de exhibicion).
     * Una mala idea seria insertar al final la puntuacion de los programadores de exhibicion y volver a ordenar,
     * ya que esto es muy costoso en tiempo.
     * Es mas eficiente una insercion ordenada**/
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int puntos[]=new int[5];

        for (int i=0;i<5;i++){
            mostrar("Puntos programador ("+(i+1)+"):");
            puntos[i]= sc.nextInt();

        }
        Arrays.sort(puntos);//ordenamos
        mostrar("Puntuacion"+Arrays.toString(puntos));
        mostrar("Cuantos programadores de exhibicion hay?");
        int progExhibicio= sc.nextInt();
        mostrar("Puntos del programador de exhibicion");
        int puntosProgExh= sc.nextInt();//puntos del prog. de exhibicion
        while (puntosProgExh!=-1){
            int pos=Arrays.binarySearch(puntos,puntosProgExh);
            int indiceInserccion;
            if (pos<0){
                indiceInserccion=-pos-1;
            }else {
                indiceInserccion=pos;
            }
            int copia[]=new int[puntos.length+1];//nueva tabla con longitud mas 1
            //copiamos los elementos antes del hueco
            System.arraycopy(puntos,0,copia,0,indiceInserccion);
            //copiamos desplazados loss elementos traas el hueco
            System.arraycopy(puntos,indiceInserccion,copia,indiceInserccion+1,puntos.length-indiceInserccion);

            copia[indiceInserccion]=puntosProgExh;
            puntos=copia;
            puntosProgExh=sc.nextInt();
        }
        mostrar("Puntuacion final"+Arrays.toString(puntos));


    }
    static  void mostrar(String texto){
        System.out.println(texto);
    }
}
