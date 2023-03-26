/* PruebaTerminal.java
*Implementa la clase Terminal. Un terminal tiene asociado un número. Los
*terminales se pueden llamar unos a otros y el tiempo de conversación corre
*para ambos. A continuación se proporciona el contenido del main y el resultado
*que debe aparecer por pantalla.
*@LDS
*/

public class PruebaTerminal {

  public static void main(String[] args) {
  //Se crean 4 instancias
    Terminal t1 = new Terminal("678 11 22 33");
    Terminal t2 = new Terminal("644 74 44 69");
    Terminal t3 = new Terminal("622 32 89 09");
    Terminal t4 = new Terminal("664 73 98 18");

  //Se imprimen por pantalla 2 instancias 
    System.out.println(t1);
    System.out.println(t2);

  //Se llama al método llama de la clase Terminal de dos instancias
    t1.llama(t2, 320);
    t1.llama(t3, 200);

  //Se imprimen todos los datos de las instancias
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
  }

}