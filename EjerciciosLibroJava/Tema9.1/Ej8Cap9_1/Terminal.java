/* Terminal.java
*Implementa la clase Terminal. Un terminal tiene asociado un número. Los
*terminales se pueden llamar unos a otros y el tiempo de conversación corre
*para ambos. A continuación se proporciona el contenido del main y el resultado
*que debe aparecer por pantalla.
*@LDS
*/

public class Terminal{
  // atributos
    private String numero;
    private int tiempoConversacion;


  // constructor
    public Terminal(String n){
      this.numero=n;

      this.tiempoConversacion=0;
    }


    // métodos
      /**
        @info: genera una llamada de un terminal a otro
        @param n: segundos de la conversación
      */
        public void llama(Terminal t, int segundos){
          this.tiempoConversacion+=segundos;

          t.tiempoConversacion+=segundos;
        }

      // método "toString"
        public String toString(){
          return "Nº "+this.numero+" - "+this.tiempoConversacion+"s de conversación.";
        }
}