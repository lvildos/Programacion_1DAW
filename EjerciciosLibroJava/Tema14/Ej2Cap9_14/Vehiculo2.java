
//Esta clase es abstracta, sirviendo de base para sus subclases Bicicleta y Coche
public abstract class Vehiculo2 {
  
  //Atributos de la clase
    private static int kilometrosTotales = 0;
    private static int vehiculosCreados = 0;
    
  // Atributo de instancia
    private int kilometrosRecorridos;
    
  
  //Métodos de la clase (3 en total)
    public Vehiculo2() {
      this.kilometrosRecorridos = 0;
    }
  
    public int getKilometrosRecorridos() {
      return this.kilometrosRecorridos;
    }
    
    public static int getKilometrosTotales() {
      return Vehiculo2.kilometrosTotales;
    }
  
    /*
     * @param k kilómetros a recorrer
     */
    public void recorre(int k) {
      this.kilometrosRecorridos += k;
      Vehiculo2.kilometrosTotales += k;
    }
  }