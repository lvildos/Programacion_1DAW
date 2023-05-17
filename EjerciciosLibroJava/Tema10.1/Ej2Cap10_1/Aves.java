/* Aves.java
*Modificación a ArrayList
*@LDS
*/

public abstract class Aves extends Mascotas {
      //Definimos los atributos
      private String pico;
      private boolean vuela;
      
      //Definimos el constructor
      public Aves (String nombre, int edad, String estado, int anioNacimiento, String pico, boolean vuela){
        super(nombre, edad, estado, anioNacimiento);
        this.pico = pico;
        this.vuela = vuela;
      }
    
      //Defiimos los métodos
      public abstract void volar();
}
