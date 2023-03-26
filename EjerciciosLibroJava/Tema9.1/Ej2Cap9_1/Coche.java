/*Coche.java
*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
*la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
*kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
*también algún método específico para cada una de las subclases. Prueba las
*clases creadas mediante un programa con un menú como el que se muestra a
*continuación:
*@LDS
*/

//La clase coche es una subclase de la clase Vehiculo.
public class Coche extends Vehiculo {

//El atributo de la clase biciclete es "potencia" y solo se puede acceder a él dentro de esta clase (por el private)
  private int potencia;

//Aquí, el constructur, inicializa el atributo "potencia", 
//llamando al constructor de la superclase Vehiculo con el "super()"
  public Coche(int c) {
    super();
    this.potencia = c;
  }

//Aquí tenemos el método, que en este caso es quemar rueda, imprimiendo por pantalla un mensaje
  public void quemaRueda() {
    System.out.println("aasfghaudgfu");
  }
}