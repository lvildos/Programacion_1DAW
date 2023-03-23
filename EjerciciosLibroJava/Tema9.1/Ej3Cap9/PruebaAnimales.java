public class PruebaAnimales{
  public static void main(String[] args){
    // instancia de las clases creadas
      Mamifero mamifero1=new Mamifero("Eva", 9);
      Ave ave1=new Ave("Lola", 2);
      Gato gato1=new Gato("Francisco", 11);
      Perro perro1=new Perro("Yoda", 6);
      Pinguino pinguino1=new Pinguino("Carolina", 5);
      Lagarto lagarto1=new Lagarto("Nube", 37);


    // interacciones
      // mamífero
        System.out.println("Mamifero: ");
        mamifero1.jugar();
        mamifero1.serDomesticado();
        System.out.println("El nombre del mamifero es "+mamifero1.getNombre());
        System.out.println("La edad del mamifero es "+mamifero1.getEdad());

      // ave
        System.out.println("Ave: ");
        ave1.volar();
        ave1.cantar();
        System.out.println("El nombre del ave es "+ave1.getNombre());
        System.out.println("La edad del ave es "+ave1.getEdad());


      // gato
        System.out.println("Gato: ");
        gato1.maullar();
        gato1.morder();
        System.out.println("El nombre del gato es "+gato1.getNombre());
        System.out.println("La edad del gato es "+gato1.getEdad());

  

      // perro
        System.out.println("Perro: ");
        perro1.ladrar();
        perro1.lamer();
        System.out.println("El nombre del perro es "+perro1.getNombre());
        System.out.println("La edad del perro es "+perro1.getEdad());

  

      // pingüino
        System.out.println("Pinguino: ");
        pinguino1.nadar();
        pinguino1.trepar();
        System.out.println("El nombre del pringuino es "+pinguino1.getNombre());
        System.out.println("La edad del pinguino es "+pinguino1.getEdad());


      // lagarto
        System.out.println("Lagarto: ");
        lagarto1.buscarComida();
        lagarto1.esconder();
        System.out.println("El nombre del lagarto es "+lagarto1.getNombre());
        System.out.println("La edad del lagarto es "+lagarto1.getEdad());
  }
}