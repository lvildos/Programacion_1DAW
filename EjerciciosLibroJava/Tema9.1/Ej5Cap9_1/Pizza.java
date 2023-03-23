/* Pizza.java
*Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
*se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
*quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
*información sobre el número total de pizzas que se han pedido y que se
*han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
*@LDS
*/

public class Pizza {
  private String tipo;
  private String tamanio;
  private String estado;
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  public Pizza(String tipo, String tamanio) {
      this.tipo = tipo;
      this.tamanio = tamanio;
      this.estado = "pedida";
      totalPedidas++;
  }

  public void sirve() {
      if (estado.equals("pedida")) {
          estado = "servida";
          totalServidas++;
      }
  }

  public static int getTotalPedidas() {
      return totalPedidas;
  }

  public static int getTotalServidas() {
      return totalServidas;
  }

  @Override
  public String toString() {
      return "Pizza " + tamanio + " de " + tipo + " está " + estado;
  }
}
