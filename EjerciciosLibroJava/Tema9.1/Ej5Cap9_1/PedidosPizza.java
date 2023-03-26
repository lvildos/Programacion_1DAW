/* PedidosPizza.java
*Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
*se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
*quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
*información sobre el número total de pizzas que se han pedido y que se
*han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
*@LDS
*/

public class PedidosPizza {
  public static void main(String[] args) {

// Se crean tres instancias  
  Pizza p1 = new Pizza("margarita", "mediana");
  Pizza p2 = new Pizza("funghi", "familiar");

  //Se llama al método sirve
  p2.sirve();

  Pizza p3 = new Pizza("cuatro quesos", "mediana");

  //Se imprimen por pantalla las tres pizzas y sus características
  System.out.println(p1);
  System.out.println(p2);
  System.out.println(p3);
  p2.sirve();

  //Se imprime el total de pizzas pedidas y servidas.
  System.out.println("pedidas: " + Pizza.getTotalPedidas());
  System.out.println("servidas: " + Pizza.getTotalServidas());
  }
  }