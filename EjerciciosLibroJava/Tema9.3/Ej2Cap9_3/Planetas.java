public class Planetas extends Astros{
//Se definen los atributos de la clase
    private double distanciaAlSol;
    private double orbitaAlSol;
    private Satelites[] satelites;
    private int numSatelites;
    public Planetas(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, String nombre, double distanciaAlSol, double orbitaAlSol){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad, nombre);

      this.distanciaAlSol=distanciaAlSol;
      this.orbitaAlSol=orbitaAlSol;
      this.satelites=new Satelites[100];
      this.numSatelites=0;
    }
    //Este método devuelve una cadena de información de otra clase sobre el planeta
      @Override
        public String muestra(){
          String muestra=("Planeta: ");
            muestra+="Su nombre es "+getNombre();
            muestra+="Su radio ecuatorial es de "+getRadioEcuatorial()+" km";
            muestra+="La rotación sobre su eje es de "+getRotacionSobreSuEje()+" horas";
            muestra+="Pesa "+getMasa()+" kg";
            muestra+="Su temperatura media es de "+getTemperaturaMedia()+" grados";
            muestra+="Su gravedad es de "+getGravedad()+" m/s^2";
            muestra+="Su distancia al sol es de "+this.distanciaAlSol+" km";
            muestra+="Su orbita alrededor del sol es de "+this.orbitaAlSol+" dias";
            muestra+="Cuenta con el siguiente numero de satelites: ";

              for(int i=0; i<this.satelites.length; i++){
                if(this.satelites[i]!=null){
                  muestra+="\n  - "+this.satelites[i].getNombre();
                }
              }

          return muestra;
        }
        public void agregarSatelite(Satelites satelite){
          if(this.numSatelites<this.satelites.length){
            this.satelites[this.numSatelites]=satelite;
  
            this.numSatelites++;
          }else{
            System.out.println("No se pueden seguir anadiendo.");
          }
        }
}