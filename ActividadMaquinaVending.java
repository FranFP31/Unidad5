package MaquinaVending;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**@Description Aplicacion para una maquina expendedora de golosinas. Tema Arrays
 * @author FranFP
 * @version 1.0
 * Arrays String golosinas
 * Arrays double
 * **/
public class ActividadMaquinaVending {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    /**Muestra el menu de la aplicacion **/
        menu();
    }
    static void menu(){
        /**
         * Arrays de la maquina
         * **/
        /**Array de las Golosinas **/
        String[][] golosinas={
                {"KitKat","Chicles de fresa","Lacasito","Palotes"},
                {"Kinder Bueno", "Ositos Haribo","Chetos Pelotazos","Twix"},
                {"Galletas OREO","M&M´s","Patatas Fritas","Chicles de Menta"},
                {"Milky Bar","KitKat Blanco","Galletas Oreo Fresa","Huesitos Blancos"},
        };

        /**Array de precios**/
        double[][] precioGolosinas={
                {1.50,1.00,1.65,1.10},
                {2.00,2.20,1.10,1.05},
                {1.25,2.00,2.50,1.00},
                {3.00,1.50,1.25,1.50},
        };
        /**Array del Stock de unidades **/
        // creo el Array de stock de golosinas y recorre todo el bucle hasta que el stock sea 5 unidades
        int [][]stock=new int[4][4];
        stock=rellenarMaquina(stock,5);
        //booleano de salida y variables de opcion del switch y ventas
        /**Variables para el switch y las ventas **/
        boolean salir=false;//creo un booleano salir para validar el bucle del menu
        double totalVentas=0;
        int opcion,fila,colum,cantStock,pos;
        /**Desarrollo del menu **/
        //desarrollamos el menu
        while (!salir){//!variable bolleana indica que es falso-> mientras sea falso se repite el bucle
            //declaro las opciones
            mostrar("************************|");
            mostrar("|Tus Gominolas Sabrosonas|");
            mostrar("|  1.Mostrar Golosinas  |");
            mostrar("|   2.Pedir  Golosinas  |");
            mostrar("|  3.Rellenar (Admin)   |");
            mostrar("|  4.Apagar la maquina  |");
            mostrar("************************|");
            do {
                mostrar("Indique su opcion ");
                opcion=sc.nextInt();
            } while (opcion < 1|| opcion  >4);
            //hacemos un swtich case de opcion
            switch (opcion){
                case 1->{//Mostrar las golosinas, y los precios
                    mostrar("Esta es nuestra seleccion de Golosinas :");
                    mostrarGlosinas(golosinas,precioGolosinas);
                    mostrar("     ");
                }
                case 2->{ //Pedir golosinas
                    mostrarSinLn("Indique la posicion de la Golosina a comprar: (0 a 33)");
                    pos=sc.nextInt();
                    //hay que validar que la posicion sea mayor o igual a 0 y menor o igual a 33
                    if (pos>=0&&pos<=3||pos>10&&pos<=13||pos>=20&&pos<=23||pos<=33) {
                        //calculamos la fila
                        colum = pos % 10;
                        //calculamos la columna
                        fila = (pos % 100) / 100;
                        //llamamamos un metodo que controle el stock y me diga true false que si hay o no de ese producto
                        if (controlStocK(stock, fila, colum)) {
                            mostrar("Ingrese el dinero");
                            double dinero= sc.nextDouble();
                            double cambio=dinero-precioGolosinas[fila][colum];
                            if (dinero!=precioGolosinas[fila][colum]){
                                    mostrar("DINERO INSUFICIENTE ");
                            }else {
                            stock[fila][colum]--;
                            totalVentas += precioGolosinas[fila][colum];
                            mostrar("Disfrute su Golosina");
                            mostrarSinLn("Recoja su cambio de:");
                            System.out.printf("%.2f" , cambio  );
                            mostrar("   ");
                            }
                        } else {
                            //cuando no quedan existencias del producto deseado
                            mostrar("No hay stock de " + golosinas[fila][colum] + " avise al encargado ");
                        }
                    } else{
                        //cuando la opcion no es valida
                        mostrar("Opcion no admitida");
                    }

                }
                case 3->{//Rellenar el stock Requiere contraseña del tecnico y solicitar la funcion de rellado
                    int passAlmacenada=1234;//almaceno la contraseña
                    mostrar("Inserte la contraseña:");
                    int pass=sc.nextInt();//contraseña a ingresar
                    if (pass==passAlmacenada){//comparo la contraseña almacenada con la que se ha introducido
                        mostrar("Cargando Productos un momento....");
                        rellenarMaquina(stock,5);
                    }else {//cuando la contraseña no es igual
                        System.out.println("No tiene permiso de tecnico ");
                    }
                }
                case 4->{//Apagar la maquina
                    //antes de apagar muestra la recoleccion de las ventas de la maquina (cierre)
                    mostrar(" El encaje de la maquina es de "+totalVentas+" €");
                    salir=true;//al cambiar el valor true se apaga la maquina
                }
            }
        }
    }
    static  int[][] rellenarMaquina(int stock[][],int valor){//estos for i rellenan automaticamente 5 de cada producto
        for (int i = 0; i <stock.length ; i++) {
            for (int j = 0; j <stock[i].length; j++) {
                stock[i][j]=5;
            }
        }
        return stock;
    }
    static void mostrarGlosinas(String golosinas[][],double[][] precioGolosinas){
        //necesitamos que recorra el array de nombres y con la posicion obtenemos el precio
        /**Metodo para mostrar las posiciones de las golosinas y su precio **/
        for (int i=0;i<golosinas.length;i++){
            for (int j = 0; j <golosinas[i].length ; j++) {
                mostrar(i+""+j+ " "+golosinas[i][j]+ " "+precioGolosinas[i][j]+" € ");
            }
        }
    }
    static boolean controlStocK(int stock[][],int fila,int colum){
        if (stock[fila][colum]==0) {
            return false;
        }else{
            return true;
        }
    }

    /**Metodos para llamado de texto con/sin salto de linea y en rojo **/
    static void mostrar(String texto){
        System.out.println(texto);
    }
    static  void mostrarSinLn(String texto){
        System.out.print(texto);
    }
    static  void mostrarErr(String texto){
        System.err.println();
    }
}
