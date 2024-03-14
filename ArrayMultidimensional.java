package ActividadesEjemplo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultidimensional {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarAlumnos(alumnosDatos());
    }

    static String[][] alumnosDatos() {
        mostrarLn("Inserte el dato requerido ");
        String alumnos[][] = new String[13][4];
        //LEEMOS LOS DATOS DE LOS ALUMNOS Y LOS GUARDAMOS EN EL ARRAY
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                ;
                if (j == 0) {
                    mostrar("Indica tu nombre-> " + (i + 1));
                    alumnos[i][j] = sc.next();
                    sc.nextLine();
                }
                if (j == 1) {
                    mostrar("indica el apellido->" + (i + 1));
                    alumnos[i][j] = sc.next();
                    sc.nextLine();
                }
                if (j == 2) {
                    mostrar("Indica la profesion->" + (i + 1));
                    alumnos[i][j] = sc.next();
                    sc.nextLine();
                }
                if (j == 3) {
                    mostrar("Indica el e-mail->" + (i + 1));
                    alumnos[i][j] = sc.next();
                    ;
                    sc.nextLine();
                }
            }
        }
        return alumnos;
    }

       /**FUNCION QUE MUESTRA LA INFORMACION ORDENADA POR EL NOMBRE DE LOS ALUMNOS Y EN FORMA DE TABLA
        * FOREACH **/
       static void mostrarAlumnos (String alumnos[][]){
              int x=alumnos.length;
              String auxNombre,auxApellido,auxProf,auxEmail;
               for (int i=0;i<x-1;i++){
                   for (int j=i+1;j<x;j++){
                       if (alumnos[i][0].compareToIgnoreCase(alumnos[j][0])>0){
                           auxNombre=alumnos[j][0];
                           auxApellido=alumnos[j][1];
                           auxProf=alumnos[j][2];
                           auxEmail=alumnos[j][3];
                           alumnos[j][0]=alumnos[i][0];
                           alumnos[j][1]=alumnos[i][1];
                           alumnos[j][2]=alumnos[i][2];
                           alumnos[j][3]=alumnos[i][3];
                           alumnos[i][0]=auxNombre;
                           alumnos[i][1]=auxApellido;
                           alumnos[i][2]=auxProf;
                           alumnos[i][3]=auxEmail;
                       }
                   }
               }
           mostrarLn("Nombre    Apellidos    Profesion   email ");
               for (String fila[]:alumnos){
                   mostrar("|");
                   for (String columna:fila){
                       mostrar(columna +" | ");
                   }
                    mostrarLn(" ");
               }
              /** for (String[]  alumnos1: alumnos){
                   for (String fila[]:alumnos1){
                       mostrarLn(columna:fila);
                   }

                   mostrarLn(Arrays.toString(alumnos1));
               }**/
           }
       static void mostrar (String texto){
           System.out.print(texto);
       }
       static void mostrarLn (String texto){
           System.out.println(texto);
       }
   }