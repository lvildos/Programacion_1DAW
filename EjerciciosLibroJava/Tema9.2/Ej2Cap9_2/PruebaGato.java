/* PruebaGato.java
*Cambia el programa anterior de tal forma que los datos de los gatos se
*introduzcan directamente en el código de la forma gatito[2].setColor("marrón") o
*bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja",
*"macho"). Muestra a continuación los datos de todos los gatos utilizando un bucle.
*@LDS
*/

public class PruebaGato {
  public static void main(String[] args) {
  //Se crea un array de 4 
    Gato[] gatito = new Gato[4];

  
    int i;
  // Se describen los 4 objetos de array inicializado anteriormente y se definen sus características
    gatito[0] = new Gato("Garfield", "naranja", "macho");
    gatito[1] = new Gato("Lola", "blanco y negro", "hembra");
    gatito[2] = new Gato("Burbuja", "beige", "hembra");
    gatito[3] = new Gato("Aquaman", "blanco", "macho");
    
    //Se imprime por pantalla las características de cada gato usando un bucle para imprimir los 4 diferentes 
    for (i = 0; i < 4; i++) {
      System.out.println("\nGato num" + (i + 1));
      System.out.println("Su nombre es " + gatito[i].getNombre() + ", su color es " + gatito[i].getColor() + " y su sexo es " + gatito[i].getSexo()  );
    }
  }
}