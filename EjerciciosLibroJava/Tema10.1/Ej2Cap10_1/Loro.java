/* Loro.java
*Modificación a ArrayList
*@LDS
*/

public class Loro extends Aves {

  // Definimos los atributos
  private String origen;
  private String habla;

  // Definimos el constructor
  public Loro(String nombre, int edad, String estado, int anioNacimiento, String pico, boolean vuela, String origen, String habla) {
      super(nombre, edad, estado, anioNacimiento, pico, vuela);
      this.origen = origen;
      this.habla = habla;
  }

  // Definimos los métodos
  public void volar() {
      System.out.println("ESTOY VOLANDOOO");
  }

  public void muestra() {
      System.out.println("El loro es de origen " + origen);
  }

  public void saluda() {
      System.out.println("Soy loro y puedo hablar!");
  }

  public void habla (){
    System.out.println("El loro habla y siempre dice: " + this.habla);

  }
}