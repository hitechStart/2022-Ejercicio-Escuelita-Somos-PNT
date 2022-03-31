package ar.com.pnt.java.challenge.model;

/**
 *@author Maximiliano Di Ludovico
 * @version 1.0.0
 * Bebida:Subclase o categoria de elementos de limpieza de u producto.
 *Producto: Clase padre o principal define las propiedades de los distintos pruductos
 */ 

public class Bebida extends Producto {

    public Bebida() {
    }

    public Bebida(String nombre, String litros, String precio) {
        super(nombre, litros, precio);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
