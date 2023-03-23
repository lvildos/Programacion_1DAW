public class Pinguino extends Ave{

  // constructor
    public Pinguino(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void trepar(){
        System.out.println("Los pinguinos no pueden trepar.");
      }

      public void nadar(){
        System.out.println("El pinguino esta nadandooo.");
      }
}