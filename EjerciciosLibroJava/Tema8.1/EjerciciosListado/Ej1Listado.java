package misFunciones;
import java.util.Scanner;
/* Ej1Listado.java
*Funciones
*@LDS
*/

public class Ej1Listado {
  public public static void main(String[] args) {

    //Abrimos el scanner para que se puedan introducir números por teclado.
    Scanner s = new Scanner (System.in);

    //Pedimos ambos números
    System.out.println("Introduzca el primer numero: ");
    double a = s.nextDouble();
    System.out.println("Introduzca el segundo numero: ");
    double b = s.nextDouble(); 

    //Llamamos a la función.
    double resultado = Varias.multiplica (a,b);
    
    System.out.println("El resultado de la multiplicacion es: " + resultado);

  }
}
