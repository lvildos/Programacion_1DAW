/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1;

/**
 *
 * @author USUARIO
 */

public class Gato {
    private String nombre;
    private String imagen;

    public Gato(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "<div class=\"accionnutria\"><img src=\"" + imagen + "\" width=\"500\"><div class=\"arrow_box\">&nbsp;Holiii, soy " + nombre + "&nbsp;</div></div>";
    }

    public String grita() {
        return "<div class=\"accionnutria\"><img src=\"" + imagen + "\" width=\"500\"><div class=\"arrow_box\">&nbsp;AAAAAAAAAAAAAAAA&nbsp;</div></div>";
    }

    public String come(String comida) {
        return "<div class=\"accionnutria\"><img src=\"" + imagen + "\" width=\"500\"><div class=\"arrow_box\">&nbsp;Estoy comiendo " + comida + " que riiiiico jeje&nbsp;</div></div>";
    }
}
