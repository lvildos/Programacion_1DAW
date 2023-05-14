/* FunciArrays.java
*Funciones
*@LDS
*/
public class FunciArrays {
  public static int sumaArray(int[] array){
    int suma = 0;
    for (int i=0; i<array.length; i++){
      suma = suma + array[i];
    }
    return suma;
  }

  public static double mediaArray(int [] array){
    double media=0;
    int suma= sumaArray(array);
    media = (double)suma/array.length;
    return media;
  }

}
