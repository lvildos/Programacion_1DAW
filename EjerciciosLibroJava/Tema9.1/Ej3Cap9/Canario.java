public class Canario extends Animal {
  //constructor

  public Canario (String nombre, int edad){
    super(nombre,edad);
  }

  //métodos

    public void piar(){
      System.out.println("El canario esta piandooo");
    }

    public void nadar(){
      System.out.println("Los canarios no pueden nadar...");
    }
}