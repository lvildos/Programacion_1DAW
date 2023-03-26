/* PruebaTarjetaRegalo.java
*La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
*las tarjetas regalo. Como primer paso para implementar la aplicación, es
*necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
*se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
*un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
*se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
*creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
*número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
*originales se quedarían con 0 € de saldo.
*@LDS
*/

public class PruebaTarjetaRegalo {

  public static void main(String[] args) {

//Se crean dos objetos con sus saldos inciales
TarjetaRegalo t1 = new TarjetaRegalo(100);
TarjetaRegalo t2 = new TarjetaRegalo(120);

//Se imprimen dos valores
System.out.println(t1);
System.out.println(t2);

//Se llama al método "gasta", reduciendo el saldo de la tarjeta indicada
t1.gasta(45.90);
t2.gasta(5);
t2.gasta(200);
t1.gasta(3.55);

//Se vuelven a imprimir dos valores, pero con los cambios hechos
System.out.println(t1);
System.out.println(t2);

//Se llama al método "fusionaCon" que crea de dos trajetas una única y junta sus valores
TarjetaRegalo t3 = t1.fusionaCon(t2);

//Se imprime el saldo resultante de las tres tarjetas
System.out.println(t1);
System.out.println(t2);
System.out.println(t3);
  }
}