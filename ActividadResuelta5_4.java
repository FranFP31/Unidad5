package ActividadesResueltas;
/**Diseñar la funcion:
 * int maximo(int t[])
 * que devuelva el máximo valor de contenido de la tabla t **/
import java.util.Scanner;

public class ActividadResuelta5_4 {
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
             mostrar("Valor introducido: "+numeros[i]);
         }
         mostrar("El valor maximo insertado es : "+ max(numeros));
    }
    static  void mostrar(String texto){
        System.out.println(texto);
    }
    static  int max(int t[]){
        int max=t[0];//asumimos que almenos hay un elemento
        for (int e:t){//aqui le decimo lo que recorre para comparar el numero mas alto
            if (e>max){//si elemento es mayor que max
                max=e;//aqui le declaramos que si se cumple la condicion de arriba el valor mas alto pasa a ser mas max
            }
        }
        return(max);//retornamos el numero mas alto
    }
}
