package ActividadesAmpliacion;

import java.util.Arrays;
import java.util.Scanner;

/**Debes desarrollar una aplicacion que ayude a gestionar las notas de un centro educativo.
 * Los alumnnos se organizan en grupos compuestos por 5 personas.
 * Leer las notas(numeros enteros) del primer, segundo y tercer trimestre de un grupo.
 * Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno que se encuentra en una
 * posicion dada(que el usuario introduce por teclado)
 * **/

public class ActividadesAmpliacion5_15 {
    static Scanner sc=new Scanner(System.in);
    static int notas[][]=altaNotas();
    public static void main(String[] args) {
   mostrar(Arrays.deepToString(notas));
   mediaGrupo(notas);
   mediaAlumno(notas);

    }

    static int[][] altaNotas(){
        int notas[][]=new int[3][5];
        for (int trimestres=0;trimestres<3;trimestres++){
            for (int alumnos=0;alumnos<5;alumnos++){
                mostrarSinLn("Inserte la nota del "+(trimestres+1)+" trimestre del alumno "+(alumnos+1)+"-> ");
               notas[trimestres][alumnos]= sc.nextInt();
            }
        }
        return notas;
    }
    static void mediaGrupo(int notas[][]){
        int media[]=new int[3];
        for (int alum=0;alum< 5;alum++){
            for (int trim = 0; trim <3; trim++) {

               media[trim]=notas[trim][alum];
            }
        }
        mostrar("La Media del primer "+((double)media[0]/5));
        mostrar("Media del segundo "+((double)media[1]/5));
        mostrar("Media del tercero"+((double)media[2]/5));
    }

    static  void mediaAlumno(int notas[][]){
        mostrar("Ingrese el numero del alumno");
        int numAlum= sc.nextInt();
        if (numAlum>=1&&numAlum<=5){
            numAlum--;
        }
        switch (numAlum){
            case 0-> {
                double media=(double) (notas[0][0]+notas[1][0]+notas [2][0])/3;
            mostrar("La media del Alumno es  "+(numAlum+1)+" es de "+media);
            }
            case 1-> {
                double media=(double) (notas[0][1]+notas[1][1]+notas [2][1])/3;
                mostrar("La media del Alumno es  "+(numAlum+1)+" es de "+media);
            }
            case 2-> {
                double media=(double) (notas[0][2]+notas[1][2]+notas [2][2])/3;
                mostrar("La media del Alumno es  "+(numAlum+1)+" es de "+media);
            }
            case 3-> {
                double media=(double) (notas[0][3]+notas[1][3]+notas [2][3])/3;
                mostrar("La media del Alumno es  "+(numAlum+1)+" es de "+media);
            }
            case 4-> {
                double media=(double) (notas[0][4]+notas[1][4]+notas [2][4])/3;
                mostrar("La media del Alumno es  "+(numAlum+1)+" es de "+media);
            }
            default -> mostrar("No esta registrado el alumno ");
        }
    }
    /**static void mediaAlumno(){ para cuando haya muchos alumnos o no sepas los que tienes
     * mostrarSinLn("texto")
     * int pos=nextInt();
     * double=mediA=(notas[0][pos-1]+notas[1][pos-1]+notas[2][pos-1])/3;
     *
     * mostrar("texto"+"%.2f",mediA)
     }**/
    //metodos de salida
    static  void mostrar(String texto){
        System.out.println(texto);
    }
    static void mostrarSinLn(String texto){
        System.out.print(texto);
    }
}
