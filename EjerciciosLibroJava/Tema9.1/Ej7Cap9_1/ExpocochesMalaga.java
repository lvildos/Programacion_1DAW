/* ExpocochesMalaga.java
*Queremos gestionar la venta de entradas (no numeradas) de Expocoches
*Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
*la zona de compra-venta con 200 entradas disponibles y la zona vip
*con 25 entradas disponibles. Hay que controlar que existen entradas antes de
*venderlas.
*@LDS
*/
import java.util.Scanner;

public class ExpocochesMalaga{
  public static void main(String[] args){
    // instancias
      Zona zonaPrincipal=new Zona(1000);
      Zona zonaCompraVenta=new Zona(200);
      Zona zonaVIP=new Zona(25);


    // Comienza el Scanner para pedir datos
      Scanner input=new Scanner(System.in);
      int opcion;


    // Se muestran las opciones a elegir por el cliente
      do{
          System.out.println("1. Mostrar numero de entradas libres");
          System.out.println("2. Vender entradas");
          System.out.println("3. Salir");
          System.out.print("Elige una opción: ");
            opcion=input.nextInt();

        // Se muestran las diferentes opciones que pueden aparecer al seleccionar la opción 1
          switch(opcion){
              case 1:
                System.out.println("Entradas disponibles en la zona principal: "+zonaPrincipal.getEntradasPorVender());
                System.out.println("Entradas disponibles en la zona de compra-venta: "+zonaCompraVenta.getEntradasPorVender());
                System.out.println("Entradas disponibles en la zona VIP: "+zonaVIP.getEntradasPorVender());
              break;

              // Se eligen las opciones al haber seleccionado la opción 2
              case 2:
                System.out.print("Para que zona quieres las entradas? ");
                  int zona=input.nextInt();
                System.out.print("Cuantas entradas quieres? ");
                  int numEntradas=input.nextInt();

                switch(zona){
                    case 1:
                      zonaPrincipal.vender(numEntradas);
                    break;

                    case 2:
                      zonaCompraVenta.vender(numEntradas);
                    break;

                    case 3:
                      zonaVIP.vender(numEntradas);
                    break;

                    default:
                      System.out.println("Zona no válida.");
                    break;
                }
              break;

              // Se sale del programa ya que se ha seleccionado la tercera opción
              case 3:
                System.out.println("Saliendo del programa...");
              break;

              /*************/

              default:
                System.out.println("Opción no válida.");
              break;
          }

          System.out.println();
      }while(opcion!=3);

  }
}