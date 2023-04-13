/* Ficha.java
*Examen del tema 8-9
*@LDS
*/

public class Ficha {

  //atributos
  private int lado1, lado2;
  private static int NumFichasCreadas;

  //constructores
  public Ficha (int lado1, int lado2){
    this.lado1=lado;
    this.lado2=lado2;
    Ficha.NumFichasCreadas++;
  }

  public Ficha(){
    this.lado1=(int)(Math.random()*7);
    this.lado2=(int)(Math.random()*7);
    Ficha.NumFichasCreadas++;
  }

  //métodos

  //Esta es una opción (más obvia), pero hay otra forma más corta
  //public String voltea{
    //int aux=this.lado1; //Se crea una variable auxiliar para almacenar el dato de voltear la ficha
    //this.lado1=this.lado2;
    //this.lado2=aux;
    //return this.toString

    public Ficha voltea{
      return new Ficha (this.lado2,this.lado1);
    }

    public boolean encaja (Ficha ficha2){
      return (this.lado1==ficha2.getLado1) || (this.lado1==ficha2.lado2) || (this.lado2==ficha2.lado1) || (this.lado2==ficha2.lado2);
    }

    

  

}
