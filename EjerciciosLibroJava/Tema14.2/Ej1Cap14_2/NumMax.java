/* NumMax.java
*Control de excepciones
*@LDS
*/
import java.util.Scanner;


public class NumMax {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    int max = Integer.MIN_VALUE;
    int num=0;

    //El siguiente bucle for pedirá 6 número al usuario y creamos una variable booleana.
    for (int i = 0; i<=5; i++ ); {
      boolean verdadero= false;
      
      //El siguiente bucle do-while se ejecutará hasta que se introduzca un numero valido (es decir, numero entero).
      do{
        try {
          System.out.println("Introduzca un numero entero: ");
          num = Integer.parseInt(s.nextLine());
           //Con el if, comprobamos si el numero ingresado es mayor al valor maximo actual. Si es así, ese
           //nuevo numero se convertirá en el mayor.
          if (num>max) {
            max=num;
          }
          //Si no se introduce un numero entero no será valido y se mostrará un mensaje comunicandolo. 
        } catch (Exception e) {
          System.out.println("Caracter no valido. Introduzca un numero entero.");
          System.out.println("Excepcion: " + e.getClass());
          System.out.println("Error " + e.getMessage());
        }
      } while (!verdadero);
    }

    System.out.println("El numero maximo es " + max);
  }
}
