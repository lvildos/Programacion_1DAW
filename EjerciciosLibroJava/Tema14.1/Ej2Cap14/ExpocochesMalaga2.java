/* ExpocochesMalaga2.java
*Aplicación de try-catch
*@LDS
*/

import java.util.Scanner;

public class ExpocochesMalaga2{
  public static void main(String[] args){
    // instancias
      Zona2 zonaPrincipal=new Zona2(1000);
      Zona2 zonaCompraVenta=new Zona2(200);
      Zona2 zonaVIP=new Zona2(25);


    // Comienza el Scanner para pedir datos
      Scanner input=new Scanner(System.in);
      String opcion=""; //Cambiamos int por String para poder introducir un valor diferente a un entero

      int opcionNum; //Se inicializa esta variable para almacenar el numero de opcion que el usuario vaya a introducir
      int zonaNum; //Se inicializa esta variable para almacenar el numero de la zona en que se van a comprar las entradas
      int numEntradasNum; //Se inicializa esta variable para almacenar el numero de entradas que quiere

    // Se muestran las opciones a elegir por el cliente
      do{
          System.out.println("1. Mostrar numero de entradas libres");
          System.out.println("2. Vender entradas");
          System.out.println("3. Salir");
          System.out.print("Elige una opcion: ");
          
          opcion = input.nextLine();

          // Se va a intentar convertir el valor de la variable "opcion" en un entero 
          try{
            opcionNum=Integer.parseInt(opcion);
          }
          catch (Exception e){  //Por si hay una excepción en la conversion del entero 
            opcionNum=0;  // Se asigna el valor 0 a la variable "opcionNum" en caso de que se produzca una excepción
          }

        // Se muestran las diferentes opciones que pueden aparecer al seleccionar la opción 1 y cambiamos "opcion" por "opcion num"
          switch(opcionNum){
              case 1:
                System.out.println("Entradas disponibles en la zona principal: "+zonaPrincipal.getEntradasPorVender());
                System.out.println("Entradas disponibles en la zona de compra-venta: "+zonaCompraVenta.getEntradasPorVender());
                System.out.println("Entradas disponibles en la zona VIP: "+zonaVIP.getEntradasPorVender());
              break;

              // Se eligen las opciones al haber seleccionado la opción 2
              case 2:
                System.out.print("Para que zona quieres las entradas? 1. Zona principal  2. Compra-Venta  3. Zona Vip ");
                  String zona=input.nextLine();

                  // Se va a intentar convertir el valor de la variable "zona" en un entero 
                  try{
                    zonaNum=Integer.parseInt(zona);
                  }
                  catch (Exception e){  //Por si hay una excepción en la conversion del entero 
                    zonaNum=0;  // Se asigna el valor 0 a la variable "zonaNum" en caso de que se produzca una excepción
                  }


                System.out.print("Cuantas entradas quieres? ");
                  String numEntradas=input.nextLine();

                  // Se va a intentar convertir el valor de la variable "zona" en un entero 
                  try{
                    numEntradasNum=Integer.parseInt(numEntradas);
                  }
                  catch (Exception e){  //Por si hay una excepción en la conversion del entero 
                    numEntradasNum=0;  // Se asigna el valor 0 a la variable "numEntradasNum" en caso de que se produzca una excepción
                  }



                switch(zonaNum){
                    case 1:
                      zonaPrincipal.vender(numEntradasNum);
                    break;

                    case 2:
                      zonaCompraVenta.vender(numEntradasNum);
                    break;

                    case 3:
                      zonaVIP.vender(numEntradasNum);
                    break;

                    default:
                      System.out.println("La zona no es valida.");
                    break;
                }
              break;

              // Se sale del programa ya que se ha seleccionado la tercera opción
              case 3:
                System.out.println("Saliendo del programa...");
              break;


              default:
                System.out.println("La opcion no es valida.");
              break;
          }

          System.out.println();
      }while(opcionNum!=3);

  }
}