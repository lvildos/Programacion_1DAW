public class Gato extends Mamifero{

  // constructor
    public Gato(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void morder(){
        System.out.println("El gato esta mordiendo, pero un juguete.");
      }

      public void maullar(){
        System.out.println("El gato esta haciendo miauuuuu.");
      }
}