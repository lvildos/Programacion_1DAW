import java.util.ArrayList;

/* Principal.java
*Modificación a ArrayList
*@LDS
*/

public class Principal {
    public static void main(String[] args) {
        // Creamos algunas instancias de las clases
        Perro perro = new Perro("Coco", 6, "Chihuahua", false);
        Gato gato = new Gato("Coral", 1, "Naranja", true);
        Canario canario = new Canario("Vicky", 3, "vivo", 2020, "negro", true, "Amarillo", true );
        Loro loro = new Loro("Raul", 7, "vivo", 2016, "Mediano", true, "Africano", "Holiiiii");
        // Creamos el ArrayList
        ArrayList<Mascotas> mascotas = new ArrayList<>();

        // Agregamos las mascotas al ArrayList
        mascotas.add(perro);
        mascotas.add(gato);
        mascotas.add(canario);
        mascotas.add(loro);

        // Mostramos información sobre cada mascota
        for (Mascotas mascota : mascotas) {
            mascota.muestra();
            mascota.habla();
        }
    }
}