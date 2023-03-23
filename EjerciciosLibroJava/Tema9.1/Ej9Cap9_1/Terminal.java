/* Terminal.java
*Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
*anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
*que puede ser rata mono o bisonte. El coste por minuto es de 6, 12 y
*30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
*cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
*llamada. A continuación se proporciona el contenido del main y el resultado
*que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
*decimales, puedes utilizar DecimalFormat.
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
