package ActividadesEjemplo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBidimensionales {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //solicito que muestre el resultado de la funcion
        mostrar(Arrays.deepToString(solicitarNum()));

    }
    static int[][] solicitarNum(){
        int numeros[][]=new int[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                mostrar("Ingrese el numero de la fila "+(i+1)+"Y la columna "+(j+1) );
                numeros[i][j]=sc.nextInt();
            }
        }
        return numeros;
    }
    static void mostrar(String texto){System.out.print(texto);}
    static void mostrarLn(String texto){System.out.println(texto);}
}
