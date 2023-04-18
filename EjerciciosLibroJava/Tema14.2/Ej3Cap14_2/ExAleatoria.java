import java.io.FileNotFoundException;
import java.io.IOException;

/* ExAleatoria.java
*Control de excepciones
*@LDS
*/

public class ExAleatoria {
    public static void main(String[] args) {
        //Generamos un numero aleatorio entre 0 y 4
        int exAleatoria = (int)(Math.random()*5);

        //Según el numero aleatorio generado, se provocará una excepción u otra
        try {
            switch (exAleatoria) {
                case 1:
                    throw new NumberFormatException();
                case 2:
                    throw new IOException();
                case 3:
                    throw new FileNotFoundException();
                case 4:
                    throw new IndexOutOfBoundsException();
                case 5:
                    throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println("La excepcion generada aleatoriamente ha sido: " + e);
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error " + e.getMessage());
        }
    }
}
