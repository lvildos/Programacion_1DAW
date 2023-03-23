public class Perro extends Mamifero{

  // constructor
    public Perro(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void ladrar(){
        System.out.println("El perro esta ladrando, no se sabe el motivo.");
      }

      public void lamer(){
        System.out.println("El perro esta lamiendo su huesito.");
      }
}