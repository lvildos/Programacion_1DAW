/* Perro.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Perro extends Mamifero{

  // constructor
    public Perro(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void ladrar(){
        System.out.println("El perro esta ladrando, no se sabe el motivo.");
      }

      public void lamer(){
        System.out.println("El perro esta lamiendo su huesito.");
      }
}