import java.util.ArrayList;
import java.util.Scanner;

public class Gestisimal {

  static ArrayList<Articulo> articulos = new ArrayList<>();

  public static void main(String[] args) {

    int opcion;
    String nuevoCodigo = "";
    String nuevaDescripcion;
    double nuevoPrecioDeCompra;
    double nuevoPrecioDeVenta;
    int nuevoStock;

    Scanner s = new Scanner(System.in);

    // Creamos el menú para que el usuario pueda elegir.
    do {
      System.out.println("Elija una opcion:");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancia");
      System.out.println("6. Salida de mercancia");
      System.out.println("7. Salir");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {

        // Definimos que hará cada opción según haya elegido el usuario.
        // Si elige la opción "Listado"
        case 1:
          // Utilizamos un bucle for-each y verificamos si el código del
          // artículo no es "LIBRE". Si no lo es, imprime el resultado.
          for (Articulo a : articulos) {
            if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
            }
          }
          break;

        // Si elige la opción "Alta"
        case 2:
          // Creamos el nuevo artículo y lo agregamos a la lista
          System.out.println("Introduzca el codigo del nuevo articulo: ");
          do {
            nuevoCodigo = s.nextLine();
            if (existeCodigo(nuevoCodigo)) {
              System.out.println("El codigo introducido ya esta en uso. Introduzca otro.");
            }
          } while (existeCodigo(nuevoCodigo));
          System.out.println("Introduzca la descripcion del nuevo articulo: ");
          nuevaDescripcion = s.nextLine();
          System.out.println("Introduzca el precio de compra del nuevo articulo: ");
          nuevoPrecioDeCompra = Double.parseDouble(s.nextLine());
          System.out.println("Introduzca el precio de venta del nuevo articulo: ");
          nuevoPrecioDeVenta = Double.parseDouble(s.nextLine());
          System.out.println("Introduzca el numero de stock del nuevo articulo ");
          nuevoStock = Integer.parseInt(s.nextLine());
          articulos.add(new Articulo(
                  nuevoCodigo, nuevaDescripcion, nuevoPrecioDeCompra, nuevoPrecioDeVenta, nuevoStock));
          break;

        // Si elige la opción "Baja"
        case 3:
          System.out.println("Introduzca el codigo del articulo a dar de baja: ");
          nuevoCodigo = s.nextLine();
          if (!existeCodigo(nuevoCodigo)) {
            System.out.println("El codigo no existe. Pruebe con otro.");
          } else {
            articulos.remove(posicionConCodigo(nuevoCodigo));
            System.out.println("Se ha borrado el articulo con exito.");
          }
          break;

        // Si elige la opcion "Modificacion"
        case 4:

          System.out.print("Introduzca el codigo del articulo a modificar: ");
          nuevoCodigo = s.nextLine();

          // Comprueba si existe el código introducido para poder modificarlo.
          if (!existeCodigo(nuevoCodigo)) {
            System.out.println("El codigo no existe. Pruebe con otro.");
          } else {

            int i = posicionConCodigo(nuevoCodigo);
            Articulo articuloModificado = articulos.get(i);

            System.out.print("El nuevo codigo es: ");
            String nuevoCodigoIntroducido = s.nextLine();
            if (!nuevoCodigoIntroducido.isEmpty()) {
              if (existeCodigo(nuevoCodigoIntroducido)) {
                System.out.println("El codigo introducido ya esta en uso. No se ha modificado.");
              } else {
                articuloModificado.setCodigo(nuevoCodigoIntroducido);
              }
            }

            System.out.print("La nueva descripcion es: ");
            String nuevaDescripcionIntroducida = s.nextLine();
            if (!nuevaDescripcionIntroducida.isEmpty()) {
              articuloModificado.setDescripcion(nuevaDescripcionIntroducida);
            }

            System.out.print("El nuevo precio de compra es: ");
            String nuevoPrecioDeCompraIntroducido = s.nextLine();
            if (!nuevoPrecioDeCompraIntroducido.isEmpty()) {
              articuloModificado.setPrecioDeCompra(Double.parseDouble(nuevoPrecioDeCompraIntroducido));
            }

            System.out.print("El nuevo precio de venta es: ");
            String nuevoPrecioDeVentaIntroducido = s.nextLine();
            if (!nuevoPrecioDeVentaIntroducido.isEmpty()) {
              articuloModificado.setPrecioDeVenta(Double.parseDouble(nuevoPrecioDeVentaIntroducido));
            }

            System.out.print("Nuevo stock: ");
            String nuevoStockIntroducido = s.nextLine();
            if (!nuevoStockIntroducido.isEmpty()) {
              articuloModificado.setStock(Integer.parseInt(nuevoStockIntroducido));
            }
          }

          break;

        // Si elige la opción "Entrada de mercancia"
        case 5:

          System.out.print("Introduzca el codigo del articulo de entrada a mercancia: ");
          nuevoCodigo = s.nextLine();

          if (!existeCodigo(nuevoCodigo)) {
            System.out.println("El codigo introducido no existe.");
          } else {
            Articulo articuloEntrada = articulos.get(posicionConCodigo(nuevoCodigo));
            System.out.print("Introduzca la cantidad de unidades del articulo a agregar: ");
            nuevoStock = Integer.parseInt(s.nextLine());
            articuloEntrada.setStock(articuloEntrada.getStock() + nuevoStock);
            System.out.println("La mercancía ha entrado correctamente.");
          }

          break;

        // Si elige la opción "Salida de mercancia"
        case 6:

          System.out.print("Introduzca el codigo del articulo a salir de mercancia: ");
          nuevoCodigo = s.nextLine();

          if (!existeCodigo(nuevoCodigo)) {
            System.out.println("El codigo introducido no existe.");
          } else {
            Articulo articuloSalida = articulos.get(posicionConCodigo(nuevoCodigo));
            System.out.print("Introduzca la cantidad de unidades del articulo a retirar: ");
            nuevoStock = Integer.parseInt(s.nextLine());
            if (articuloSalida.getStock() - nuevoStock < 0) {
              System.out.println("No hay suficiente stock del articulo para retirar.");
            } else {
              articuloSalida.setStock(articuloSalida.getStock() - nuevoStock);
              System.out.println("La mercancía se ha retirado correctamente.");
            }
          }

          break;
      } // switch
    } while (opcion != 7);

  }

  public static boolean existeCodigo(String codigo) {
    for (Articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }

}