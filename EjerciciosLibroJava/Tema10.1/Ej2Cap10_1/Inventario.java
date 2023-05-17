/* Inventario.java
*Modificación a ArrayList
*@LDS
*/

import java.util.ArrayList;

public class Inventario {
  private ArrayList<Animal> animales = new ArrayList<>();

  public void mostrarListaAnimales(){
    for (Animal animal : animales) {
      System.out.println(animal.getTipo() + ": " + animal.getNombre());
    }
  }

  public void mostrarAnimal (Animal animal){
    System.out.println(animal.toString());
  }

  public void mostrarInventario(){
    for (Animal animal : animales){
      System.out.println(animal.toString());
    }
  }

  public void insertarAnimalInventario(Animal animal){
    animales.add(animal);
  }

  public void eliminarAnimalInventario(Animal animal){
    animales.remove(animal);
  }
  
  public void vaciarInventario(){
    animales.clear();
  }
}
