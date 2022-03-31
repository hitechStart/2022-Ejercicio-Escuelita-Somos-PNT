package ar.com.pnt.java.challenge.Service;

import ar.com.pnt.java.challenge.model.Producto;
import java.util.ArrayList;
/**
 *@author Maximiliano Di Ludovico
 * @version 1.0.0
 * IServicio:Interfaz que define los metodos abstractos que presta la
 * capa de servicios.
 */
public interface IServicio {

    public void cargarProductosAListar(ArrayList<Producto> productos);

    public void listarProductos(ArrayList<Producto> productos);

    public void ordenarProductosPorPrecio(ArrayList<Producto> productos);

    public void obtenerProductoCaroYBarato(ArrayList<Producto> productos);

}
