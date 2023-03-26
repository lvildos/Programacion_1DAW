
//Aquí se aplican los tres atributos de la clase Gato. Son private, ya que solo se pueden
//acceder mediante esta clase
public class Gato {
  private String nombre;
  private String color;
  private String sexo;
  
// Se crea el constructor para inicializar los tres atributos
  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }

//Se crean los métodos, cada uno con su get y set
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String raza) {
    this.sexo = sexo;
  }
}