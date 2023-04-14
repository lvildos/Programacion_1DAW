

//La clase coche es una subclase de la clase Vehiculo.
public class Coche2 extends Vehiculo2 {

  //El atributo de la clase biciclete es "potencia" y solo se puede acceder a él dentro de esta clase (por el private)
    private int potencia;
  
  //Aquí, el constructur, inicializa el atributo "potencia", 
  //llamando al constructor de la superclase Vehiculo con el "super()"
    public Coche2(int c) {
      super();
      this.potencia = c;
    }
  
  //Aquí tenemos el método, que en este caso es quemar rueda, imprimiendo por pantalla un mensaje
    public void quemaRueda() {
      System.out.println("aasfghaudgfu");
    }
  }
