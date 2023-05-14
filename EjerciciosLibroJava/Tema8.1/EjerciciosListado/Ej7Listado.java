package misFunciones;
import java.util.Scanner;

/* Ej7Listado.java
*Funciones
*@LDS
*/

public class Ej7Listado {
  public static void main(String[] args) {

  //Abrimos el scanner para que se puedan introducir los números por teclado.  
  Scanner s = new Scanner (System.in);

  //Pedimos los números
  System.out.println("Introduzca el ancho del rectangulo: ");
  double ancho = s.nextDouble();
  System.out.println("Introduzca el alto del rectangulo");
  double alto = s.nextDouble();

  //Llamamos a la función.
  double perimetro = Geometria.perimetroRectangulo(ancho, alto);
  double area = Geometria.areaRectangulo(ancho, alto);

  System.out.println("El perimetro es igual a: " + perimetro + " y el area es igual a: " + area);


  }
}