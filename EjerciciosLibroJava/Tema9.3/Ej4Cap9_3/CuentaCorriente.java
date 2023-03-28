public class CuentaCorriente extends CuentaBancaria{
  // constructor
    public CuentaCorriente(double saldo){
      super(saldo);
    }


    public void calcularIntereses(){
      double intereses=getSaldo()*getInteresAnualBasico();
        anadir(intereses);

      System.out.println("Se han anadido los intereses de la cuenta: "+intereses+" euros.");
    }
}