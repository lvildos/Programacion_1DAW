import java.util.Scanner;
/* Ej20a28.java
* Crea una biblioteca de funciones matemáticas que contenga las siguientes
* funciones. Recuerda que puedes usar unas dentro de otras si es necesario. C8.1 Ej20 al 28
*@LDS
*/

public class Ej20a28 {
  //Función 1: Genera el Array de tamaño aleatorio con intervalos.
  public static int[] generaArrayInt (int a, int min, int max){
    int[] num = new int [a];

    for (int i=0; i<a; i++) {
      num[a] = (int) (Math.random() * (max+1-min) + min);
    }
    return num;
  }

  //Función 2: Devuelvo el mínimo del arrray.
  public static int minimoArrayInt (int x[]) {
    int min = Integer.MAX_VALUE;
    for (int m=0; m<x.length; m++) {

      if (x[m]<min){
        min = x[m];
      }
    }
    return min;
  } 

  //Función 3:Devuelve el máximo del array.
  public static int maximoArrayInt (int x[]) {
    int max = Integer.MIN_VALUE;
    for (int m=0; m<x.length; m++) {
      if (x[m]<max){
        max = x[m];
      }
    }
    return max;
  } 

  //Función 4: Devuelve la media del array.
  public static int mediaArrayInt (int x[]){
    int suma=0;
    for (int m=0; m<x.length; m++){
      suma = suma + (int) x[m]; 
    }
    int media = suma/x.length;
    return media;
  }

  //Función 5: Dice si el número está en el array o no
  public static boolean estaEnArrayInt(int num, int x[]) {
    for (int m=0; m<x.length; m++){
      if (x[m] == num){
        return true;
      }
    }
    return false;
  }

  //Función 6: Busca un número en el array y devuelve su posición.
  public static int posicionEnArray(int num, int x[]){
    for (int m=0; m<x.length; m++){
      if (x[m]==num){
        return m;
      }
    }
    return 0;
  }

  //Función 7: Le da la vuelta al array.
  public static int[] volteaArrayInt(int[] x) {
    int[] resultado = new int[x.length];
    for (int i = 0; i < x.length; i++) {
        resultado[x.length - 1 - i] = x[i];
    }
    return resultado;
  }

  //Función 8: Rota n posiciones a la derecha los números de un array.
  public static int[] rotaDerechaArrayInt(int[] x, int num) {
    int[] result = new int[x.length];
    for (int i = 0; i < x.length; i++) {
        int indice = (i + num) % x.length;
        result[indice] = x[i];
    }
    return result;
  }

  //Función 9: Rota n posiciones a la izquierda los números de un array.
  public static int[] rotaIzquierdaArrayInt(int[] x, int num) {
    int[] result = new int[x.length];
    for (int i = 0; i < x.length; i++) {
        int indice = (i - num + x.length) % x.length;
        result[indice] = x[i];
    }
    return result;
  }










  
}
