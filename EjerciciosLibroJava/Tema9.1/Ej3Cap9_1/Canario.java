/* Canario.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Canario extends Animal {
  //constructor

  public Canario (String nombre, int edad){
    super(nombre,edad);
  }

  //métodos

    public void piar(){
      System.out.println("El canario esta piandooo");
    }

    public void nadar(){
      System.out.println("Los canarios no pueden nadar...");
    }
}