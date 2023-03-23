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