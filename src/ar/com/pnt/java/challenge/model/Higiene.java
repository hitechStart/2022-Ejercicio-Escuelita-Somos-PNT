package ar.com.pnt.java.challenge.model;

/**
 *@author Maximiliano Di Ludovico
 * @version 1.0.0
 * Higiene:Subclase o categoria de elementos de limpieza de u producto.
 *Producto: Clase padre o principal define las propiedades de los distintos pruductos
 */ 
public class Higiene extends Producto {

    public Higiene() {
    }

    public Higiene(String nombre, String litros, String precio) {
        super(nombre, litros, precio);
    }

    @Override
    public String toString() {
        //Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
        return "Nombre: " + this.getNombre() + " /// Litros: "
                + this.getLitros() + "ml /// Precio: $" + this.getPrecio();
    }

}
