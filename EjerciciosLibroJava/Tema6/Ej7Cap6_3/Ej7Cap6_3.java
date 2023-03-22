/*Ej7Cap6_3.java
*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
*para los 14 partidos y el pleno al quince (15 filas).
*@LDS
*/
public class Ej7Cap6_3{
  public static void main(String[] args){
      int columnas=3;

    // Se generan las apuestas para cada partido
      for(int fila=1; fila<=14; fila++){
            System.out.printf("%2d. |", fila);


          // Se generan las columnas de apuestas del partido
            for(int apuesta=1; apuesta<=columnas; apuesta++){
              // Se genera un número aleatorio entre 1 y 3 para el resultado del partido
                int resultadoPartido=(int)(Math.random()*3)+1;

                String resultado="";

                if(resultadoPartido==1){
                  resultado="1  |";
                }else if(resultadoPartido==2){
                  resultado="  2|";
                }else{
                  resultado=" X |";
                }

                System.out.print(resultado);
            }

            System.out.println();
      }

      System.out.print("\nPleno al 15 - Local...");



    // generar un número aleatorio entre 0 y 3 para los goles del equipo local
      int golesLocal=(int)(Math.random()*4);



    // asignar el valor correspondiente a la variable golesLocalString
      String golesLocalString="";

      if(golesLocal<3){
        golesLocalString=Integer.toString(golesLocal);
      }else{
        golesLocalString="M";
      }

      // imprimir los goles o "M" si no se marcaron más de 2 goles
        System.out.print(golesLocalString);

      System.out.print("   Visitante...");

    // generar un número aleatorio entre 0 y 3 para los goles del equipo visitante
      int golesVisitante=(int)(Math.random()*4);


    // asignar el valor correspondiente a la variable golesVisitanteString
      String golesVisitanteString="";

      if(golesVisitante<3){
        golesVisitanteString=Integer.toString(golesVisitante);
      }else{
        golesVisitanteString="M";
      }

      // imprimir los goles o "M" si no se marcaron más de 2 goles
        System.out.print(golesVisitanteString);
  }
}