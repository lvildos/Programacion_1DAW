/* Mascotas.java
*Modificación a ArrayList
*@LDS
*/

public abstract class Mascotas {
    // Definimos los atributos

    private String nombre;
    private int edad;
    private String estado;
    private int anioNacimiento;

  
    // Definimos el constructor

    public Mascotas(String nombre, int edad, String estado, int anioNacimiento){
      this.nombre = nombre;
      this.edad = edad;
      this.estado = estado;
      this.anioNacimiento = anioNacimiento;
    }

    // Definimos los métodos
    public abstract void muestra();

    public void cumpleanios(){
      edad++;
    }

    public void morir(){
      estado = "muerto";
    }

    public abstract void habla();

    //Definimos los getters y setters

    public String getNombre() {
      return nombre;
  }

    public void setNombre(String nombre) {
      this.nombre = nombre;
  }

     public int getEdad() {
      return edad;
  }

    public void setEdad(int edad) {
      this.edad = edad;
  }

    public String getEstado() {
      return estado;
  }

    public void setEstado(String estado) {
      this.estado = estado;
  }

    public int getAnioNacimiento() {
      return anioNacimiento;
  }

    public void setAnioNacimiento(int anioNacimiento) {
      this.anioNacimiento = anioNacimiento;
  }
}
  