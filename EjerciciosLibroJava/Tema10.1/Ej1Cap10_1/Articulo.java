/* Articulo.java
*Modificación a ArrayList
*@LDS
*/

public class Articulo {

  //Declaramos las variables como privadas para solo poder modificarlos a través de los métodos getter y setter en este programa.
  private String codigo = "LIBRE";
  private String descripcion;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;

  //Creamos los métodos get y set de "Código" para poder acceder y modificar la variable desde otras partes del programa.
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  //Creamos los métodos get y set de "Descripción" para poder acceder y modificar la variable desde otras partes del programa.
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  //Creamos los métodos get y set de "PrecioDeCompra" para poder acceder y modificar la variable desde otras partes del programa.
  public double getPrecioDeCompra() {
    return precioDeCompra;
  }

  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }

  //Creamos los métodos get y set de "PrecioDeVenta" para poder acceder y modificar la variable desde otras partes del programa.
  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  //Creamos los métodos get y set de "Stock" para poder acceder y modificar la variable desde otras partes del programa.
  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String toString() {
    String datos = "";
    datos += "El codigo es el siguiente: " + this.codigo + " ,";
    datos += "La descripcion es la siguiente: " + this.descripcion + " ,";
    datos += "El precio de compra es el siguiente: " + this.precioDeCompra + " ,";
    datos += "El precio de venta es el siguiente: " + this.precioDeVenta + " ,";
    datos += "El numero de unidades en stock es el siguiente " + this.stock + ".";
    return datos;
    }
}
