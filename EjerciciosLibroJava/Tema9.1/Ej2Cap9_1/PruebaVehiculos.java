/*PruebaVehiculos.java
*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
*la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
*kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
*también algún método específico para cada una de las subclases. Prueba las
*clases creadas mediante un programa con un m3enú como el que se muestra a
*continuación:
*@LDS
*/

import java.util.Scanner;

public class PruebaVehiculos {

  public static void main(String[] args) {

    int opcion = 0;
    int km;
    
    Bicicleta bicicleta1 = new Bicicleta(9);
    Coche coche1 = new Coche(1900);

    Scanner s=new Scanner (System.in);

    while (opcion != 8) {
      System.out.println("\n1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Cambia las ruedas a la bicicleta");
      System.out.println("6. Ver kilometraje de la bicicleta");
      System.out.println("7. Ver kilometraje del coche");
      System.out.println("8. Ver kilometraje total");
      System.out.println("9. Salir");
      System.out.println("Elige una opcion (1-9): ");
      
      opcion = s.nextInt();
      
      switch (opcion) {
        case 1:
          System.out.print("Cuantos kilometros quiere recorrer? ");
          km = s.nextInt();
          bicicleta1.recorre(km);
          break;
        case 2:
          bicicleta1.hazCaballito();
          break;
        case 3:
          System.out.print("Cuantos kilometros quiere recorrer? ");
          km = s.nextInt();
          coche1.recorre(km);
          break;
        case 4:
          coche1.quemaRueda();
          break;
        case 5:
          System.out.println("La ruedas de la bicicleta han sido cambiadas.");
          break;
        case 6:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(bicicleta1.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.print("El coche lleva recorridos ");
          System.out.println(coche1.getKilometrosRecorridos() + " Km");
          break;
        case 8:
          System.out.print("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } // Cierra el switch
    } // Cierra el bucle while
  }
}