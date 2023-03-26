/*Coche.java
*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
*la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
*kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
*también algún método específico para cada una de las subclases. Prueba las
*clases creadas mediante un programa con un menú como el que se muestra a
*continuación:
*@LDS
*/



public class Coche extends Vehiculo {

  private int potencia;

  public Coche(int c) {
    super();
    this.potencia = c;
  }

  public void quemaRueda() {
    System.out.println("aasfghaudgfu");
  }
}