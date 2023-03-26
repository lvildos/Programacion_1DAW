/* TarjetaRegalo.java
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

public class TarjetaRegalo {
//Aquí se definen los atributos
    private double saldo;
    private String digitos;


  //Aquí se define el constructor
    public TarjetaRegalo(double s){
      this.saldo=s;

      this.digitos="";
        for(int i=0; i<5; i++){
          this.digitos+=(int)(Math.random()*10);
        }
    }


  // Aquí se definen los métodos
      public String getDigitos(){
        return digitos;
      }


   //El parámetro k representa el total a gastar

      public void gasta(double k){
        if(k>this.saldo){
          System.out.println("No tienes suficiente saldo para gastar "+String.format("%.2f", k)+" euros");
        }else{
          this.saldo-=k;
        }
      }


      public double getSaldo(){
        return saldo;
      }


    // El método toString() imprime las características de las tarjetas
      public String toString(){
        return "Tarjeta nº "+getDigitos()+" - Saldo "+String.format("%.2f", getSaldo())+" euros";// el "String.format()" me permite mostrar el saldo con 2 decimales
      }

   //El parámetro f sirve para fusionar las tarjetas

      public TarjetaRegalo fusionaCon(TarjetaRegalo f){
        double nuevoSaldo=this.saldo+f.getSaldo();

        this.saldo=0;
        f.saldo=0;

        return new TarjetaRegalo(nuevoSaldo);
      }
}

