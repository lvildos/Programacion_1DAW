import java.util.Scanner;

public class Gestisimal {

  // N determina el tamaño del array
  static final int N = 100;

  static Articulo[] articulos = new Articulo[N];

  public static void main(String[] args) {

    // Inicializa el array
    for(int i = 0; i < N; i++) {
      Gestisimal.articulos[i] = new Articulo();
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
          
        for (int i = 0; i < articulos.size(); i++) {
          Articulo a = articulos.get(i);
          if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
          }
      }
          break;

        // Si elige la opción "Alta"
        case 2:
          
          if (primeraPosicionLibre() == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {
            
            // Comenzamos a introducir los datos que nos pide de cada articulo.  
            System.out.println("Introduzca el codigo del nuevo articulo: ");
            
              // Comprueba que el nuevo codigo no se repite
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

            // Creamos el nuevo artículo
            articulos[primeraPosicionLibre()] = new Articulo(
              nuevoCodigo, nuevaDescripcion, nuevoPrecioDeCompra, nuevoPrecioDeVenta, nuevoStock);
          }
          
          break;
          
          //ME HE QUEDADO AQUI///////////////////////////////////////////////////////////
        // BAJA ///////////////////////////////////////////////////////////////
        case 3:
          pintaTitulo("BAJA");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();
    
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulos[posicionConCodigo(codigoIntroducido)].setCodigo("LIBRE");
            System.out.println("Artículo borrado.");  
          }
          
          break;
          
        // MODIFICACIÓN ///////////////////////////////////////////////////////
        case 4:
          pintaTitulo("MODIFICACIÓN");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.print("Introduzca los nuevos datos del artículo");
            System.out.println(" o INTRO para dejarlos igual.");
      
            int i = posicionConCodigo(codigoIntroducido);

            System.out.println("Código: " + articulos[i].getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = s.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulos[i].setCodigo(codigoIntroducido);
            }
            
            System.out.println("Descripción: " + articulos[i].getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntroducida = s.nextLine();
            if (!descripcionIntroducida.equals("")) {
              articulos[i].setDescripcion(descripcionIntroducida);
            }
            
            System.out.println("Precio de compra: " + articulos[i].getPrecioDeCompra());
            System.out.print("Nuevo precio de compra: ");
            String precioDeCompraIntroducidoString = s.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulos[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
            }
            System.out.println("Precio de venta: " + articulos[i].getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            String precioDeVentaIntroducidoString = s.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulos[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }
            System.out.println("Stock: " + articulos[i].getStock());
            System.out.print("Nuevo stock: ");
            String stockIntroducidoString = s.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulos[i].setStock(Integer.parseInt(stockIntroducidoString));
            }
          }
          
          break;
  
          // ENTRADA DE MERCANCÍA /////////////////////////////////////////////
          case 5:
            pintaTitulo("ENTRADA DE MERCANCÍA");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = s.nextLine();
        
            if (!existeCodigo(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              int i = posicionConCodigo(codigoIntroducido);
              System.out.println("Entrada de mercancía del siguiente artículo: ");
              System.out.println(articulos[i]);
              System.out.print("Introduzca el número de unidades que entran: ");
              String stockIntroducidoString = s.nextLine();
              articulos[i].setStock(
                Integer.parseInt(stockIntroducidoString) + articulos[i].getStock());
              System.out.println("La mercancía ha entrado en el almacén.");  
            }
            
            break;

            // SALIDA DE MERCANCÍA ////////////////////////////////////////////
            case 6:
              pintaTitulo("SALIDA DE MERCANCÍA");
              
              System.out.print("Por favor, introduzca el código del artículo: ");
              codigoIntroducido = s.nextLine();

              if (!existeCodigo(codigoIntroducido)) {
                System.out.println("Lo siento, el código introducido no existe.");
              } else {
                int i = posicionConCodigo(codigoIntroducido);
                System.out.println("Salida de mercancía del siguiente artículo: ");
                System.out.println(articulos[i]);
                System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                stockIntroducido = Integer.parseInt(s.nextLine());
                if (articulos[i].getStock() - stockIntroducido > 0) {
                  articulos[i].setStock(articulos[i].getStock() - stockIntroducido);
                  System.out.println("La mercancía ha salido del almacén.");
                } else {
                  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                }
              }
              
              break;
      } // switch
    } while (opcion != 7);
  }

  // FUNCIONES ////////////////////////////////////////////////////////////////

  /**
   * Busca la primera posición libre del array.
   * Si no quedan huecos, devuelve -1.
   * 
   * @return primera posición libre del array o -1 si no quedan huecos
   */
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * Dice si existe o no un artículo con un determinado código.
   * 
   * @return true si existe el código y false si no existe
   */
  public static boolean existeCodigo(String codigo) {
    for (Articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Pinta un título con subrayado.
   */
  public static void pintaTitulo(String titulo) {
    System.out.println("\n" + titulo);
    for (int i = 0; i < titulo.length(); i++) {
      System.out.print("=");  
    }
    System.out.println();
  }

  /**
   * Devuelve la posición dentro del array en la que se encuentra un artículo
   * con un determinado código.
   * Si el código no se encuentra, devuelve -1.
   * 
   * @return posición dentro del array en la que se encuentra un artículo
   */
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  
}