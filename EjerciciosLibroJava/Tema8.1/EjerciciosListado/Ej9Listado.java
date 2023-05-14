package misFunciones;
import java.util.Scanner;

/* Ej9Listado.java
*Funciones
*@LDS
*/

public class Ej9Listado {
  public static void main(String[] args) {

    //Abrimos el scanner para que se puedan introducir los números por teclado.
    Scanner s = new Scanner (System.in);


    //Pedimos los numeros
    System.out.println("Introduzca el primer numero: ");
    int a = s.nextInt();
    System.out.println("Introduzca el segundo numero: ");
    int b = s.nextInt();
    System.out.println("Introduzca el tercer numero: ");
    int c = s.nextInt();

    //Comprobamos el numero mayor
    int elevado = Varias.masElevado(a, b);

    System.out.println("El numero mas elevado entre esos tres es: " + elevado);

  }
}
