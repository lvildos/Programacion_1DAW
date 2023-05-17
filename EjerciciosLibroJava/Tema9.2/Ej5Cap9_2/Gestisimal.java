import java.util.Scanner;

/* Gestisimal.java
*Uso de Arrays
*@LDS
*/

public class Gestisimal {

  // "tamanio" determina el tamaño del array
  static final int tamanio = 100;

  //Definimos el array
  static Articulo[] articulos = new Articulo[tamanio];

  public static void main(String[] args) {

    // Se inicia el array
    for(int i = 0; i < tamanio; i++) {
      articulos[i] = new Articulo();
    }

    int opcion;
    int nuevoStock;
    double nuevoPrecioDeCompra;
    double nuevoPrecioDeVenta;
    String codigo;
    String nuevoCodigo = "";
    String nuevaDescripcion;

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
          //Utilizamos un bucle for-each y verificamos si el código del artículo no es "LIBRE". Si no lo es, imprime el resultado.
        for (Articulo a : articulos) {
          if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
          }
      }
          break;

        // Si elige la opción "Alta"
        case 2:
          //Comprueba si hay hueco para añadir el articulo.
          if (primeraPosicionLibre() == tamanio) {
            System.out.println("La base de datos esta llena y no se pueden introducir mas articulos.");
          } else {
            
            // En caso de tener hueco, comenzamos a introducir los datos que nos pide de cada articulo.  
            System.out.println("Introduzca el codigo del nuevo articulo: ");
            
              // Comprueba que el nuevo código no se repite.
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

            // Creamos el nuevo artículo al array.
            articulos[primeraPosicionLibre()] = new Articulo(
              nuevoCodigo, nuevaDescripcion, nuevoPrecioDeCompra, nuevoPrecioDeVenta, nuevoStock);
          }
          
          break;
          
        //Si elige la opción "baja"
        case 3:
          
          System.out.print("Introduzca el codigo del articulo a dar de baja: ");
          nuevoCodigo = s.nextLine();
    
          if (!existeCodigo(nuevoCodigo)) {
            System.out.println("El codigo no existe. Pruebe con otro.");
          } else {
            articulos[posicionConCodigo(nuevoCodigo)].setCodigo("LIBRE");
            System.out.println("Se ha borrado el articulo con exito.");  
          }
          
          break;
          
        //Si elige la opcion "modificación"
        case 4:

          System.out.print("Introduzca el codigo del articulo a modificar: ");
          nuevoCodigo = s.nextLine();

          //Comprueba si existe el codigo introducido para poder modificarlo.
          if (!existeCodigo(nuevoCodigo)) {
            System.out.println("El codigo no existe. Pruebe con otro.");
          } else {
            System.out.print("Introduzca los datos modificados del articulo");
      
            int i = posicionConCodigo(nuevoCodigo);

            //Si quiere modificar el codigo
            System.out.print("El nuevo codigo es: ");
            nuevoCodigo = s.nextLine();
            if (!nuevoCodigo.equals("")) {
              articulos[i].setCodigo(nuevoCodigo);
            }
            
            //Si quiere modificar la descripción
            System.out.print("La nueva descripcion es: ");
            nuevaDescripcion = s.nextLine();
            if (!nuevaDescripcion.equals("")) {
              articulos[i].setDescripcion(nuevaDescripcion);
            }
            
            //Si quiere modificar el precio de compra
            System.out.print("El nuevo precio de compra es: ");
            String precioDeCompraIntroducido = s.nextLine();
            if (!precioDeCompraIntroducido.equals("")) {
              articulos[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducido));
            }

            //Si quiere modificar el precio de venta
            System.out.print("El nuevo precio de venta es: ");
            String precioDeVentaIntroducido = s.nextLine();
            if (!precioDeVentaIntroducido.equals("")) {
              articulos[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducido));
            }

            //Si quiere modificar el stock
            System.out.print("Nuevo stock: ");
            String stockIntroducido = s.nextLine();
            if (!stockIntroducido.equals("")) {
              articulos[i].setStock(Integer.parseInt(stockIntroducido));
            }
          }
          
          break;
  
          // Si elige la opcion "entrada de mercancia".
          case 5:

            System.out.print("Introduzca el codigo del articulo de entrada a mercancia:  ");
            nuevoCodigo = s.nextLine();

            //Si ya existe ese codigo, no se puede volver a introducir.
            if (!existeCodigo(nuevoCodigo)) {
              System.out.println("El codigo introducido ya esta en uso. Introduzca otro");
            } else {
              int i = posicionConCodigo(nuevoCodigo);
              System.out.print("¿Cuantas unidades de este articulo entran? ");
              String stockIntroducido = s.nextLine();
              articulos[i].setStock(
                Integer.parseInt(stockIntroducido) + articulos[i].getStock());
              System.out.println("La nueva mercancia ha entrado correctamente.");  
            }
            
            break;

            //Si elige la opcion "salida de mercancía"
            case 6:

              System.out.print("Introduzca el codigo del articulo a salir de mercancia: ");
              nuevoCodigo = s.nextLine();

              if (!existeCodigo(nuevoCodigo)) {
                System.out.println("El codigo introducido no existe. No se puede realizar esta funcion.");
              } else {
                int i = posicionConCodigo(nuevoCodigo);
                System.out.print("¿Cuantas unidades de este articulo salen? ");
                nuevoStock = Integer.parseInt(s.nextLine());
                if (articulos[i].getStock() - nuevoStock > 0) {
                  articulos[i].setStock(articulos[i].getStock() - nuevoStock );
                  System.out.println("Se ha sacado la mercancia correctamente.");
                } else {
                  System.out.println("No existen suficientes unidades de mercancia.");
                }
              }
              
              break;
      } // switch
    } while (opcion != 7);
  }

  // DECLARAMOS LAS FUNCIONES QUE HEMOS UTILIZADO EN EL MAIN

  //Esta funcion busca la primera posicion libre del array para introducir un nuevo articulo.
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }
  
  
  //Comprueba si existe o no el articulo con el codigo que hemos introducido.
  public static boolean existeCodigo(String codigo) {
    for (Articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }
  


  // Nos da la posicion en la que se encuentra el articulo dentro del array.

  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  
}