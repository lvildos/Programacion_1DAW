/* Canario.java
*Modificación a ArrayList
*@LDS
*/

public class Canario extends Aves {

  // Definimos los atributos
  private String color;
  private boolean canta;

  // Definimos el constructor
  public Canario(String nombre, int edad, String estado, int anioNacimiento, String pico, boolean vuela, String color, boolean canta) {
      super(nombre, edad, estado, anioNacimiento, pico, vuela);
      this.color = color;
      this.canta = canta;
  }

  // Definimos los métodos
  public void volar() {
      System.out.println("ESTOY VOLANDOOOO");
  }

  public void muestra() {
      System.out.println( "El nombre del canario es " + getNombre() + ", su color es " + color + " su edad es " + getEdad());
  }

  public void habla() {
      System.out.println("No habla, pero cuando canta hace: fiuuuuuuuuuuu");
  }
}