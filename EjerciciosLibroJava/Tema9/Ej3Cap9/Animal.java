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