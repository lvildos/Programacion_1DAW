import java.util.Scanner;

/* Ej1a6.java
* Crea una biblioteca de funciones matemáticas que contenga las siguientes
* funciones. Recuerda que puedes usar unas dentro de otras si es necesario. C8.1 Ej1 al 6
*@LDS
*/

public class Ej1a6 {
  //Función 6:Le da la vuelta a un número.
  
  public static int voltea(int num){
    int volteado;
    volteado = 0;
    int resto;
    resto = 1;

    while(num > 0){
      resto = num % 10;
      volteado = volteado * 10 + resto;
      num = num / 10;
    }
    return volteado;
  }
  
  //Función 1: Devuelve verdadero si el número que se pasa como parámetro
  //es capicúa y falso en caso contrario.
  
  public static boolean esCapicua(int num){
    int volteado;
    volteado = voltea(num);

    if(num == volteado){
      return true;
    }
    return false;
  }  

  //Función 2: Devuelve verdadero si el número que se pasa como parámetro
  //es primo y falso en caso contrario.
  
  public static boolean esPrimo(int num){
    for(int i = 2; i < num; i++){
      if(num%i == 0){
        return false;
      } 
    }    
    return true;
  }
  
  //Función 3: Devuelve el menor primo que es mayor al número que
  //se pasa como parámetro.
  
  public static int sigPrimo(int num){
    boolean primo;
    primo = false;

    while (primo == false){
      num++;
      primo = esPrimo(num);
    }

    return num;
  }  
  
    //Función 4: Dada una base y un exponente devuelve la potencia.
    
  public static int potencia(int b, int e){
    int acum;
    acum = 1;

    for(int i = 1; i <= e; i++){
      acum = acum * b;
    }
    return acum;
  }
  
    //Función 5: Cuenta el número de dígitos de un número entero.
    
  public static int digitos(int num){
    int cuentaNum;
    cuentaNum = 0;

    while(num > 0){
      cuentaNum++;
      num /= 10;
    }
    return cuentaNum;  
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

  //Función 1: Devuelve verdadero si el número que se pasa como parámetro
  //es capicúa y falso en caso contrario.

    System.out.print("Introduce un numero y le digo si es capicuo o no: ");
    int nCap;
    nCap = sc.nextInt();
    
    boolean capicuoNoCapicuo;
    capicuoNoCapicuo = esCapicua(nCap);

    if(capicuoNoCapicuo){
      System.out.println("Es capicuo");
    } else {
      System.out.println("No es capicuo");
    }
    System.out.println("");

  //Función 2: Devuelve verdadero si el número que se pasa como parámetro
  //es primo y falso en caso contrario.

    System.out.print("Introduce un numero y te digo si es primo o no: ");
    int numPrimo;
    numPrimo = sc.nextInt();

    boolean primoNoPrimo;
    primoNoPrimo = esPrimo(numPrimo);

    if(primoNoPrimo){
      System.out.println("Es primo");
    } else {
      System.out.println("No es primo");
    }
    System.out.println("");

  //Función 3: Devuelve el menor primo que es mayor al número que
  //se pasa como parámetro.
  
    System.out.print("Introduce un numero y te digo su siguiente primo: ");
    int numParaSigPrimo;
    numParaSigPrimo = sc.nextInt();

    int numSigPrimo;
    numSigPrimo = sigPrimo(numParaSigPrimo);

    System.out.println("El siguiente primo es: " + numSigPrimo);
    System.out.println("");

    //Función 4: Dada una base y un exponente devuelve la potencia.
    
    System.out.println("Calculo de una potencia: ");
    System.out.print("Introduce la base: ");
    int numBase;
    numBase = sc.nextInt();

    System.out.print("Introduce el exponente: ");
    int numExp;
    numExp = sc.nextInt();

    int pot;
    pot = potencia(numBase, numExp);

    System.out.println("La potencia introducida es igual a " + pot);
    System.out.println("");

    //Función 5: Cuenta el número de dígitos de un número entero.

    System.out.print("Introduce un numero y te dire cuantos digitos tiene: ");
    int numDig;
    numDig = sc.nextInt();

    int cantDig;
    cantDig = digitos(numDig);

    System.out.println("La cantidad de digitos es: " + cantDig);
    System.out.println("");

  //Función 6:Le da la vuelta a un número.

    System.out.print("Introduce un numero y lo volteare: ");
    int numParaVolt;
    numParaVolt = sc.nextInt();

    int numVolt;
    numVolt = voltea(numParaVolt);

    System.out.println("El numero volteado es " + numVolt);
    
  }
}

