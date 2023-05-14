package misFunciones;
import java.util.Scanner;

/* Ej15Listado.java
*Funciones
*@LDS
*/
public class Ej15Listado {
  public static void main(String[] args) {
    int [] n = array(100);
    int suma = sumaArray (n);
    int media = mediaArray(n);

    System.out.println("La suma del array generado es: " + suma);
    System.out.println("La media del array generado es: " + media);
    
  }
  
}
