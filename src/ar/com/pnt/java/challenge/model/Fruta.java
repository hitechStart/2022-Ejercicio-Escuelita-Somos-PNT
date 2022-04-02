package ar.com.pnt.java.challenge.model;

import java.text.DecimalFormat;

/**
 *@author Maximiliano Di Ludovico
 * @version 1.0.1
 * Fruta:Subclase o categoria de elementos de limpieza de u producto.
 * Producto: Clase padre o principal define las propiedades de los distintos pruductos
 * unidad: medida o magnitud que se mide la fruta ("Kilos")
 */ 

public class Fruta extends Producto {

    private String unidad;

    public Fruta() {
    }

    public Fruta(String nombre, String precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        //Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
        return "Nombre: " + this.getNombre()
                + " /// Precio: $" + this.getPrecio()
                + " // Unidad de venta: " + unidad;
    }
}
