

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
      return "Pizza " + tipo + " " + tamanio + ", " + estado;
  }
}
