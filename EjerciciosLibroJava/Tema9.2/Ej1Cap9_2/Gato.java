/* Gato.java
*Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
*de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
*todos los gatos utilizando también un bucle.
*@LDS
*/

public class Gato {
  // Aqui estan las variables y los atributos
  String nombre;
  int edad;
  String sexo;
  static int sardinas = 10;
  int sardinasComidas = 0;

  // constructor
  public Gato(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
  }

  // método especifico de las sardinas
  public void come(int s) {
    System.out.print(this.nombre + ": ");
    if (sardinas >= s) {
      for (int i = 0; i < s; i++) {
        System.out.print("Nam...");
        sardinas--;
        sardinasComidas++;
      }
      System.out.println();
    } else {
      System.out.println("Ya no hay sardinas. ");
    }
  }

  //métodos getters
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getSexo() {
    return sexo;
  }

  public int getSardinasComidas() {
    return sardinasComidas;
  }

  public static int getSardinas() {
    return sardinas;
  }
}