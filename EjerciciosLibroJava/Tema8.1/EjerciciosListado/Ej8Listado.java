package misFunciones;
import java.util.Scanner;

/* Ej8Listado.java
*Funciones
*@LDS
*/

public class Ej8Listado {
  public static void main(String[] args) {

    //Abrimos el scanner para que se puedan introducir los números por teclado.
    Scanner s = new Scanner (System.in);


    //Pedimos el numero
    System.out.println("Introduzca el numero: ");
    int n = s.nextInt();

    //Llamamos a las funciones
    int sumatorio = Varias.suma1aN(n);
    int producto = Varias.producto1aN(n);
    int intermedio = Varias.intermedio1aN(n);

    System.out.println("El sumatorio desde 1 al numero introducido es: " + sumatorio);
    System.out.println("El factorial de 1 al numero introducido es: " + producto);
    System.out.println("El intermedio entre 1 y el numero introducido es: " + intermedio);
  }
}