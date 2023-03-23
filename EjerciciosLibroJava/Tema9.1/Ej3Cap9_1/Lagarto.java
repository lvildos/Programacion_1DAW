/* Lagarto.java
*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
*al menos, tres métodos específicos de cada clase y redefne el/los método/s
*cuando sea necesario. Prueba las clases creadas en un programa en el que se
*instancien objetos y se les apliquen métodos.
*@LDS
*/
public class Lagarto extends Animal{

  // constructor
    public Lagarto(String nombre, int edad){
      super(nombre, edad);
    }


  // métodos
      public void buscarComida(){
        System.out.println("El lagarto esta buscando comida (intentando cazar).");
      }

      public void esconder(){
        System.out.println("El lagarto se esta escondiendo, ha visto peligro");
      }
}