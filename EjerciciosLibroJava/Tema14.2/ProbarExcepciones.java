/* ProbarExcepciones.java
*Control de excepciones
*@LDS
*/

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {

  //main
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opcion;

    //Creamos un bucle do-while para mostrar el menú de opciones 
    //y permitir al usuario seleccionar una opción.
    do{
      System.out.println("Elija una opcion del menu");
      System.out.println("1. Provoca un error 'StackOverFlowError'");
      System.out.println("2. Provoca una excepción 'NumberFormatException'");
      System.out.println("3. Provoca una excepción 'ArrayIndexOutOfBoundsException'");
      System.out.println("4. Provoca una excepción 'FileNotFoundException'");
      System.out.println("5. Provoca una excepción 'ArithmeticException'");

      opcion=s.nextInt();

      //Creamos un bloque try-catch para manejar las excepciones que puedan generarse al 
      //llamar a las funciones que corresponden a cada opción del menú.

      try {
        switch (opcion) {
            case 1:
                funcionStackOverFlow();
                break;
            case 2:
                funcionNumberFormatException();
                break;
            case 3:
                funcionArrayIndexOutOfBoundsException();
                break;
            case 4:
                funcionFileNotFoundException();
                break;
            case 5:
                funcionArithmeticException();
                break;
            case 6:
                System.out.println("Gracias por su visita. Saliendo del programa");
                break;
            default:
                System.out.println("Opcion no valida. Vuelva a intentarlo.");
                break;
        }
      } catch (StackOverflowError e) {
        System.out.println("Excepcion: " + e.getClass());
        System.out.println("Error " + e.getMessage());
      } catch (NumberFormatException e) {
        System.out.println("Excepcion: " + e.getClass());
        System.out.println("Error " + e.getMessage());
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Excepcion: " + e.getClass());
        System.out.println("Error " + e.getMessage());
      } catch (FileNotFoundException e) {
        System.out.println("Excepcion: " + e.getClass());
        System.out.println("Error " + e.getMessage());
      } catch (ArithmeticException e) {
        System.out.println("Excepcion: " + e.getClass());
        System.out.println("Error " + e.getMessage());
      }
    
    }while (opcion!=6);
  }
    
  //FUNCIONES

  //Primera función. La función se llama a sí misma de forma repetida, generando un bucle infinito.
  public static void funcionStackOverFlow() throws StackOverflowError {
    funcionStackOverFlow(); 
  }

  //Segunda función. Se intenta convertir una cadena de caracteres en un numero entero.
  public static void funcionNumberFormatException() throws NumberFormatException {
    String secuencia= "Me llamo Lunna";
    int num=Integer.parseInt(secuencia);
  }

  //Tercera función. Se intenta acceder a una posición inexistente del array.
  public static void funcionArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
    int [] array = new int [7];
    array[12]= 157;
  }

  //Cuarta función. Se intenta acceder a un archivo que no existe. 
  public static void funcionFileNotFoundException() throws FileNotFoundException {
    java.io.FileReader pdf=new java.io.FileReader("actividades_programacion");
    System.out.println(pdf);
  }

  //Quinta función. Se intenta dividir un número entre 0, siendo esto imposible y dando lugar a un error aritmético.
  public static void funcionArithmeticException() throws ArithmeticException {
    int num1=6;
    int num2=0;
    int division= num1 / num2;
  }
}