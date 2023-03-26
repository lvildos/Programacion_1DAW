/*PruebaVehiculos.java
*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
*la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
*kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
*también algún método específico para cada una de las subclases. Prueba las
*clases creadas mediante un programa con un menú como el que se muestra a
*continuación:
*@LDS
*/

//Esta clase es abstracta, sirviendo de base para sus subclases Bicicleta y Coche
public abstract class Vehiculo {
  
//Atributos de la clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
// Atributo de instancia
  private int kilometrosRecorridos;
  

//Métodos de la clase (3 en total)
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  /*
   * @param k kilómetros a recorrer
   */
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}