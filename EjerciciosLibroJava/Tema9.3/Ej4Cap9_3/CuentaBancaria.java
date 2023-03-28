public abstract class CuentaBancaria{
    private String numeroCuenta="";
    private String iban="";
    private double saldo;

    private static final double interesAnualBasico=0.055;

    public CuentaBancaria(double saldo){
        for(int i=0; i<4; i++){
          for(int j=0; j<4; j++){
            this.numeroCuenta+=(int)(Math.random()*10);
          }

          this.numeroCuenta+=" ";
        }

        this.iban+="ES";

        for(int i=0; i<2; i++){
          this.iban+=(int)(Math.random()*10);
        }

        this.iban+=" ";

        for(int i=0; i<4; i++){
          for(int j=0; j<4; j++){
            this.iban+=(int)(Math.random()*10);
          }

          this.iban+=" ";
        }

        this.saldo=saldo;
    }


    public String getNumeroCuenta(){
      return this.numeroCuenta;
    }

      public String getIban(){
        return this.iban;
      }


      public double getSaldo(){
        return this.saldo;
      }


      public double getInteresAnualBasico(){
        return this.interesAnualBasico;
      }

      public void anadir(double cantidad){
        this.saldo+=cantidad;
      }


      public void ingresar(double saldo){
        anadir(saldo);
      }


      public void retirar(double saldo){
        anadir(-saldo);
      }

      public String informacionCuenta(){
        String informacionCuenta="\n";
          informacionCuenta+="El numero de cuenta es: "+getNumeroCuenta();
          informacionCuenta+="El IBAN es: "+getIban();
          informacionCuenta+="El saldo actual es: "+getSaldo();
          informacionCuenta+="\n \n";

        return informacionCuenta;
      }

      public void traspaso(CuentaBancaria receptora, double dinero){
        if(dinero>getSaldo()){
          System.out.println("No hay suficiente dinero");
        }else{
          retirar(dinero);

          receptora.ingresar(dinero);
        }
      }

      public abstract void calcularIntereses();

      public String toString(int identificativo){
        String toString="\n";
          toString+="\n- Cuenta numero "+identificativo+" -> **** **** **** "+getNumeroCuenta().substring(getNumeroCuenta().length()-5);
          toString+="\n \n";

        return toString;
      }
}