public class CuentaAhorro extends CuentaBancaria{

    private static final double saldoMinimo=2500.0;

    public CuentaAhorro(double saldo){
      super(saldo);
    }

      public void calcularIntereses() {
        if(getSaldo()>=saldoMinimo){
          double intereses=getSaldo()*(2*getInteresAnualBasico());
            anadir(intereses);

          System.out.println("Se han anadido los intereses de la cuenta: "+intereses+" euros.");
        }else{
          double intereses=getSaldo()*(0.5*getInteresAnualBasico());
            anadir(intereses);

          System.out.println("Se han anadido los intereses de la cuenta: "+intereses+" euros.");
        }
      }
}