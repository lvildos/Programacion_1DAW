/* Animal.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Animal {
  private String nombre;
  private int edad;

  //Este es el constructor

  public Animal(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
  }

  // Aquí comienzan los métodos
  public String getNombre() {
      return this.nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getEdad() {
      return this.edad;
  }

  public void setEdad(int edad) {
      this.edad = edad;
  }

  public void comer() {
      System.out.println("El animal esta comiendo.");
  }

  public void dormir() {
      System.out.println("El animal esta durmiendo.");
  }

  public void mover() {
      System.out.println("El animal se esta moviendo.");
  }
}