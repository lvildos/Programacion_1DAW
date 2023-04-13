
import java.util.Scanner;

public class PruebaVehiculos2 {

  public static void main(String[] args) {

  //  Se crean variables
    String opcion = "";  //Convertimos la variable opcion de "int" a "String"
    int km;
    int opcionNum=0;  //Declaramos una nueva variable para poder convertir la cadena String a int en el "catch".
    
    Bicicleta2 bicicleta1 = new Bicicleta2(9);
    Coche2 coche1 = new Coche2(1900);

    Scanner s=new Scanner (System.in);

    //Opciones que van a imprimirse por pantalla para que el usuario elija
    while (opcionNum != 8) { //Cambiamos la variable "opcion" por "opcionNum"
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
      
      opcion = s.nextLine();

      if(isNumeric(opcion)){
        opcionNum=Integer.parseInt(opcion);
      } else {
        opcionNum=0;
      }
      
      // Opciones segun las elecciones anteriores de los usuarios
      switch (opcionNum) {
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
          System.out.println(Vehiculo2.getKilometrosTotales() + " Km");
        default:
        System.out.println("Opcion no valida.");
      } // Cierra el switch
    } // Cierra el bucle while
  }
  private static boolean isNumeric(String str){
    return str != null && str.matches ("[0-9]+");
  }
}