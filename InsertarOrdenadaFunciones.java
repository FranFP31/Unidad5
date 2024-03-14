package ActividadesEjemplo;

import java.util.Arrays;
import java.util.Scanner;

/**Vamos a realizar la cesta de la compra
 * Cada vez que compramos, variamos productos y cantidad:
 * Creamos un array que crecera a medida que insertemos productos, para ello utilizaremos un pequeño menu
 * y para la ejecucion funciones de busqueda y de insercion**/
public class InsertarOrdenadaFunciones {
    static Scanner sc = new Scanner(System.in);
    static  String cesta[] = new String[0];


    public static void main(String[] args) {
        menu();


    }

    static void mostrar(String texto) {
        System.out.println(texto);
    }

    static void menu() {
        byte opcion;
        mostrar("------Cesta compra-------");
        mostrar("1.Insertar              |");
        mostrar("2.Mostrar Cesta         |");
        mostrar("3.Eliminar Producto     |");
        mostrar("4.Imprimir y Salir      |");
        mostrar("------------------------");
        do {
            mostrar("Indique su opcion");
            opcion = sc.nextByte();
        } while (opcion < 1&&  opcion > 4);
        switch (opcion) {
            case 1 -> {
                cesta = insertar(cesta);
                menu();
            }
            case 2-> {
                mostrar(Arrays.toString(cesta));
                menu();
            }
            case 3->{
             cesta = eliminar(cesta);
             menu();
             }

            case 4->{
                mostrar("Hay que comprar");
              cesta=imprimir(cesta);
              }
        }
    }

    static String[] insertar(String cesta[]) {
        //pregunto el producto a insertar
        mostrar("Que producto quiere añadir");
        String productoNuevo = sc.next();sc.nextLine();
        //lo buscamos si esta mandamos un mensaje, si esta lo insertamos si no mandamos un mensaje
        boolean existe=buscarProducto(cesta,productoNuevo);
        if (existe){
            mostrar("El producto ya existe");
        }else {//lo inserta
         cesta=Arrays.copyOf(cesta,cesta.length+1);
         cesta[cesta.length-1]=productoNuevo;//en el ultimo indice inserta el nuevo valor.
        }
        //lo devolvemos a la funcion  menu.
        return cesta;
    }

    static boolean buscarProducto(String cesta[], String productoNuevo) {
        boolean existe = false;
        int indice = 0;
        //recorremos el array
        while (indice < cesta.length && !cesta[indice].equals(productoNuevo)) {
            indice++;
        }
        if (indice < cesta.length) {
            existe = true;

        }
        return existe;
    }
    static String[] eliminar(String cesta[]){
        //pregunto el producto que deseo borrar
        mostrar("Que elemento desea eliminar");
        String productoEliminar=sc.next();sc.nextLine();
        int indice=0;

        //busco el elemento en la tabla
        for (int i=0;i<cesta.length;i++){
            if (cesta[i].equals(productoEliminar)){
                 indice=i;
            }
        }
        if (indice>cesta.length){
        mostrar("El producto no esta en la cesta");
        } else{
            cesta[indice]=cesta[cesta.length-1];
            cesta=Arrays.copyOf(cesta,cesta.length-1);
        }
        return cesta;
    }
    static String []imprimir(String cesta[]) {
        int indice;
        for (indice = 0; indice < cesta.length; indice++) {
            mostrar("\t"+cesta[indice]);
        }

        return cesta;
    }



}

