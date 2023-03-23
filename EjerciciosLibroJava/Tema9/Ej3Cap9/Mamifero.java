public class Mamifero extends Animal{

  // constructor
    public Mamifero(String nombre, int edad){
        super(nombre, edad);
    }


  // métodos
      public void jugar(){
        System.out.println("El mamifero esta jugando solo.");
      }
    
      public void serDomesticado(){
        System.out.println("El mamifero esta siendo domesticado.");
      }
}