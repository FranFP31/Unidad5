package ActividadesEjemplo;

import java.util.Arrays;

public class InsertarTablaOrdenada {
    public static void main(String[] args) {
        int t []={1,2,3,4,6,7,8};
        System.out.println(Arrays.toString(t));
        int nuevo =5;
        int indiceInsercion= Arrays.binarySearch(t,nuevo);
        //si indice de insercion >=0, el nuevo elemento (que esta repetido se inserta en
        //el lugar en que ya estaba, desplazando al original. Si por el contrario:
        if(indiceInsercion<0){//si no se encuentra
            //calcula donde debe estar
            indiceInsercion=indiceInsercion-1;
        }
        int copia[]=new int[t.length+1];//nueva tabla con longitud +1
        //copiamos los elementos  antes del "hueco"
        System.arraycopy(t,0,copia,0,indiceInsercion);
        //copiamos desplazados los elementos tras el hueco
        System.arraycopy(t,indiceInsercion,copia,indiceInsercion+1,t.length-indiceInsercion);
        //asignamos donde se va a situar el nuevo elemento
        t=copia;// t referencia la nueva tabla
        System.out.println(Arrays.toString(t));
    }
}
