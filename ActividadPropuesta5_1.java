package ActividadesPropuestas;

import java.util.Arrays;

/**Crea 5 elementos:
 * la primera de enteros
 * la segunda de double
 * la tercera de booleanos
 * mostrarlo por funcion */
public class ActividadPropuesta5_1 {
    public static void main(String[] args) {
        int tablaEnteros[]={1,2,3,4,5};
        double decimales[]={13.5,31.2,11.11,12.44,46.1293};
         boolean verdad[]={true,false,true,true,false};

        for (int i=0;i<tablaEnteros.length;i++){
            mostrar("La variable almacenada  en la poscion:"+(i+1)+". Es->"+tablaEnteros[i]);
        }

        mostrar("*********");
        for (int i=0;i<decimales.length;i++){
            mostrar("La variable almacenada en la poscion:"+(i+1)+". Es->"+decimales[i]);
        }

        mostrar("*******");
        for (int i=0;i<verdad.length;i++){
            mostrar("La variable almacenada en la poscion:"+(i+1)+". Es->"+verdad[i]);
        }


    }
    static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
}
