/* Varias.java
*Funciones
*@LDS
*/

public class Varias {
  public static double multiplica(double a, double b){
    return a*b;
  }

  public static int minimo (int a, int b) {
    if (a<b){
      return a;
    } else {
      return b;
    }
  }

  public static int dimeSigno (int a) {
    if (a<0){
      return -1;
    } else if (a==0) {
      return 0;
    } else{
      return 1;
    }
  }

  public static int suma1aN (int n){
    int suma = 0;
    for (int i =1; i<=n; i++){
      suma = suma + i;
    }

    return suma;
  }

  public static int producto1aN (int n){
    int producto = 0;
    for (int i =1; i<=n; i++){
      producto = producto * i;
    }

    return producto;
  }

  public static int intermedio1aN (int n){
    return (1+n)/2;

  }

  public static int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

  public static void tablaMultiplicar(int n){
    for (int i=1; i<=10; i++){
      System.out.println(n + " x " + i + " = " + (n * i));
    }

}

  public static void triangulo (char caracter, int lineas){
    for (int i=1; i<=lineas; i++){
      for (int j=1; j<=i; j++){
        System.out.print(caracter + " ");
      }
      System.out.println();
    }
  }

  public static boolean numPrimo(int n){
    if (n<=1){
      return false;
    }

    for (int i=2; i<=n/2; i++){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }






}
