/* Gato.java
*Modificación a ArrayList
*@LDS
*/

public class Gato extends Mascotas {

    //Definimos los atributos
  private String color;
  private boolean peloLargo;
  
  //Definimos el constructor
  public Gato (String nombre, int edad, String color, boolean peloLargo ){
    super(nombre, edad, "vivo", edad);
    this.color = color;
    this.peloLargo = peloLargo;
  }

  //Defiimos los métodos
  public void muestra(){
    System.out.println("El nombre del gato es " + getNombre() + ", su color es " + color + ", su edad es " + getEdad());
    System.out.println("Tiene el pelo largo ? " + peloLargo);
  }

  public void habla(){
    System.out.println("No hablo soy un gato. Ups... Miuau miau!!");
  }
}

