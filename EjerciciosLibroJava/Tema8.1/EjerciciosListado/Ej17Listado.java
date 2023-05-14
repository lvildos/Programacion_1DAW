package misFunciones;
import java.util.Scanner;

/* Ej17Listado.java
*Funciones
*@LDS
*/
public class Ej17Listado {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;
    do{
      System.out.println("Introduzca un numero para saber si es primo o no. Para finalizar, introduzca 0: ");
      num = s.nextInt();
      if (numPrimo(num)){
        System.out.println("El numero es primo");
      } else{
        System.out.println("El numero no es primo");
      }
    } while (num!=0);

    }

  }


