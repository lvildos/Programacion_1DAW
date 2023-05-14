package misFunciones;
import java.util.Scanner;

/* Ej11Listado.java
*Funciones
*@LDS
*/
public class Ej11Listado {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);

    System.out.println("Introduzca el numero: ");
    int n = s.nextInt();

    Varias.tablaMultiplicar(n);

    System.out.println("Aquí tienes la tabla de multiplicar.");
  }
  
}
