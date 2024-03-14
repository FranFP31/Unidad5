package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_12 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        mostrar(Arrays.deepToString(operacion()));

    }
    static int [][]operacion(){
        int num[][]=new int[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                num[i][j]=10*i+j;
            }
        }
        mostrarTabla(num);
        return num;
    }
    static void mostrarTabla(int num[][]){
        for (int fila[]:num) {
            for (int col : fila) {
                mostrar(""+col + " ");
            }
            mostrarLn(" ");
        }
    }

    static void mostrar(String texto){System.out.print(texto);}
    static void mostrarLn(String texto){System.out.println(texto);}
}

