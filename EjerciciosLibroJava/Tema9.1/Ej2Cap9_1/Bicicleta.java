/* Bicicleta.java
*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
*la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
*kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
*también algún método específico para cada una de las subclases. Prueba las
*clases creadas mediante un programa con un menú como el que se muestra a
*continuación:
*@LDS
*/

//La clase bicileta es una subclase de la clase Vehiculo.
public class Bicicleta extends Vehiculo {

//El atributo de la clase biciclete es "caidas" y solo se puede acceder a él dentro de esta clase (por el private)
  private int caidas;
  
//Aquí, el constructur, inicializa el atributo "caídas", 
//llamando al constructor de la superclase Vehiculo con el "super()"

  public Bicicleta(int p) {
    super();
    this.caidas = p;
  }

  //Aquí tenemos el método, que en este caso es hacer el caballito, imprimiendo por pantalla un mensaje
  public void hazCaballito() {
    System.out.println("Mirad como hago el caballitooooo");
  }
}