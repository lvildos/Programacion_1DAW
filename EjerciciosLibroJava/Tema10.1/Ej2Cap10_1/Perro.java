/* Perro.java
*Modificación a ArrayList
*@LDS
*/

public class Perro extends Mascotas {

  //Definimos los atributos
  private String raza;
  private boolean pulgas;
  
  //Definimos el constructor
  public Perro (String nombre, int edad, String raza, boolean pulgas){
    super(nombre, edad, "vivo", edad );
    this.raza = raza;
    this.pulgas = pulgas;
  }

  //Defiimos los métodos
  public void muestra(){
    System.out.println("El nombre del perro es " + getNombre() + ", su raza es " + raza + ", su edad es " + getEdad());
    System.out.println("Tiene pulgas ? " + pulgas);
  }

  public void habla(){
    System.out.println("No hablo soy un perro. Ups... Guau guau!!");
  }
}
