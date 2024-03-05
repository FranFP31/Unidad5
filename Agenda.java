package ActividadesEjemplo;
/**Inserta 10 nombres  y numeros de telefono y luego mostrarlos **/
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nombre=new String[3];
        int []telefono= new int[3];
        for (int i =0;i<nombre.length;i++){
            mostrar("Indique el Nº "+(i+1));
            nombre[i]=sc.next();sc.nextLine();
            mostrar("Indica el numero de telefono");
            telefono[i]= sc.nextInt();
        }
        /**Mostrar los nombres y numeros**/
        mostrarErr("Agenda");
        for (int i =0;i<nombre.length;i++){
            mostrar("La persona "+nombre[i]+" su telefono es "+telefono[i]);
        }
        mostrar("¿Estas buscando un nombre?");
        String nombreBusqueda=sc.nextLine();
        //envio el nombre a la funcion buscar y recibo el indice donde esta ubicado, luego muestro el numero del indice en cuestion
        buscar(nombre,nombreBusqueda);
        mostrar("Quieres cambiar algun dato? Dime de quien->");



    }
    static  void  mostrar(String texto){
        System.out.println(texto);
    }
    static  void mostrarErr(String texto){
        System.err.println(texto);
    }
    static  int  buscar(String nombre[],String nombreBusqueda){
        int indice=0;
        while (indice< nombre.length&&!nombre[indice].equals(nombreBusqueda)){
            indice++;
        }
        return  indice;
    }


}
