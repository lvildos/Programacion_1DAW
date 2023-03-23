/* Pinguino.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Pinguino extends Ave{

  // constructor
    public Pinguino(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void trepar(){
        System.out.println("Los pinguinos no pueden trepar.");
      }

      public void nadar(){
        System.out.println("El pinguino esta nadandooo.");
      }
}