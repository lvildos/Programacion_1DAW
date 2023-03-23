/* Ave.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Ave extends Animal {
  //constructor

  public Ave (String nombre, int edad){
    super(nombre,edad);
  }

  //métodos

    public void volar(){
      System.out.println("El ave esta volandoooooo");
    }

    public void cantar(){
      System.out.println("El ave esta cantandoooo");
    }
}