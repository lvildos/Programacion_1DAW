public class Satelites extends Astros{
//Se definen los atributos de la clase
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planetas planeta;

    public Satelites(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, String nombre, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planeta){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad, nombre);

      this.distanciaAlPlaneta=distanciaAlPlaneta;
      this.orbitaPlanetaria=orbitaPlanetaria;
      this.planeta=planeta;
    }
    //Este método devuelve una cadena de información de otra clase sobre el satélite
      @Override
      public String muestra(){
        String muestra=("\n---------SATÉLITE---------");
          muestra+="Su nombre es "+getNombre();
          muestra+="Su radio ecuatorial es de "+getRadioEcuatorial()+" km";
          muestra+="La rotación sobre su eje es de "+getRotacionSobreSuEje()+" horas";
          muestra+="Pesa "+getMasa()+" kg";
          muestra+="Su temperatura media es de "+getTemperaturaMedia()+" grados";
          muestra+="Su gravedad es de "+getGravedad()+" m/s^2";
          muestra+="Su distancia al sol es de "+this.distanciaAlSol+" km";
          muestra+="Su orbita alrededor del sol es de "+this.orbitaAlSol+" dias";
          muestra+="Su planeta: "+this.planeta.getNombre();

        return muestra;
      }
}