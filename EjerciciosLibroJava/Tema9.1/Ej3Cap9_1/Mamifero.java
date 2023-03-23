/* Mamifero.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Mamifero extends Animal{

  // constructor
    public Mamifero(String nombre, int edad){
        super(nombre, edad);
    }


  // métodos
      public void jugar(){
        System.out.println("El mamifero esta jugando solo.");
      }
    
      public void serDomesticado(){
        System.out.println("El mamifero esta siendo domesticado.");
      }
}