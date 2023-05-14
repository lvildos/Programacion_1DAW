package misFunciones;
import java.util.Scanner;

/* Ej14Listado.java
*Funciones
*@LDS
*/
public class Ej14Listado {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);

    System.out.println("Introduzca el caracter que se de dea imprimir: ");
    char caracter = s.nextInt();

    System.out.println("Introduzca el numero de lineas: ");
    int lineas = s.nextInt();

    Varias.triangulo (caracter, lineas);
  }
  
}
