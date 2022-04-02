package ar.com.pnt.java.challenge.test;

import ar.com.pnt.java.challenge.Service.ServicioImp;
import ar.com.pnt.java.challenge.model.Producto;
import java.util.ArrayList;
/**
 *@author Maximiliano Di Ludovico
 * @version 1.0.1
 * productos: Objeto que contiene una lista de distintos productos
 * Metodo principal que procesa el codigo realizado en Java 8.
 * 
 */
public class TestPtn {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<Producto>();
        ServicioImp servicio = new ServicioImp();

        try {
            servicio.cargarProductosAListar(productos);
            servicio.listarProductos(productos);
            servicio.ordenarProductosPorPrecio(productos);
            servicio.obtenerProductoCaroYBarato(productos);
            
        } catch (RuntimeException e) { 
            System.out.println("Error durante la ejecucion.");
        } finally {
            System.exit(0);
        }
    }
}
