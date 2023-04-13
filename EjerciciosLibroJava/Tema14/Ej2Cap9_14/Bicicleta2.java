

//La clase bicileta es una subclase de la clase Vehiculo.
public class Bicicleta2 extends Vehiculo2 {

  //El atributo de la clase biciclete es "caidas" y solo se puede acceder a él dentro de esta clase (por el private)
    private int caidas;
    
  //Aquí, el constructur, inicializa el atributo "caídas", 
  //llamando al constructor de la superclase Vehiculo con el "super()"
  
    public Bicicleta2(int p) {
      super();
      this.caidas = p;
    }
  
    //Aquí tenemos el método, que en este caso es hacer el caballito, imprimiendo por pantalla un mensaje
    public void hazCaballito() {
      System.out.println("Mirad como hago el caballitooooo");
    }
  }