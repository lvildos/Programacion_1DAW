/* Gato.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Gato extends Mamifero{

  // constructor
    public Gato(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void morder(){
        System.out.println("El gato esta mordiendo, pero un juguete.");
      }

      public void maullar(){
        System.out.println("El gato esta haciendo miauuuuu.");
      }
}