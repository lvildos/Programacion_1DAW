package misFunciones;
import java.util.Scanner;

/* Ej3Listado.java
*Funciones
*@LDS
*/

public class Ej3Listado {
  public static void main(String[] args) {

    //Abrimos el scanner para que se puedan introducir los números por teclado.
    Scanner s = new Scanner(System.in);

    //Pedimos ambos números
    System.out.println("Introduzca el primer numero: ");
    int a = s.nextInt();
    System.out.println("Introduzca el segundo numero: ");
    int b = s.nextInt();

    //Llamamos a la función
    int min = Varias.minimo (a, b);

    System.out.println("El numero minimo es: " + min);

  }
  
}
