
public abstract class Astros{

//Aquí se definen los atributos de la clase
    private double radioEcuatorial;
    private double rotacionSobreSuEje;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;
    private String nombre;

//Aquí definimos el constructor que inicializa los atributos de la clase
    public Astros(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, String nombre){
      this.radioEcuatorial=radioEcuatorial;
      this.rotacionSobreSuEje=rotacionSobreSuEje;
      this.masa=masa;
      this.temperaturaMedia=temperaturaMedia;
      this.gravedad=gravedad;
      this.nombre=nombre;
    }

//Aqui se definen los métodos de la clase, devolviendo valores de los atributos
      public double getRadioEcuatorial(){
        return this.radioEcuatorial;
      }

      public double getRotacionSobreSuEje(){
        return this.rotacionSobreSuEje;
      }

      public double getMasa(){
        return this.masa;
      }

      public double getTemperaturaMedia(){
        return this.temperaturaMedia;
      }

      public double getGravedad(){
        return this.gravedad;
      }

      public String getNombre(){
        return this.nombre;
      }

      //método definido por las subclases que se heredan de esta clase
      public abstract String muestra();
}