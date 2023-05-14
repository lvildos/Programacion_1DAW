package misFunciones;
import java.util.Scanner;

/* Ej4Listado.java
*Funciones
*@LDS
*/

public class Ej4Listado {
  public static void main(String[] args) {

    //Abrimos el scanner para que se puedan introducir los números por teclado.
    Scanner s = new Scanner (System.in);


    //Pedimos el numero
    System.out.println("Introduzca el numero: ");
    int a = s.nextInt();

    //Llamamos a la función
    int signo = Varias.dimeSigno (a);

    System.out.println("Resultado: " + signo);
  }
  
  
}
