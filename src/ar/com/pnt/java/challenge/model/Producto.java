package ar.com.pnt.java.challenge.model;

/**
 * @author Maximiliano Di Ludovico
 * @version 1.0.1 Producto: Clase padre o principal define las propiedades de
 * los distintos pruductos
 *
 * Esta clase extiende de la interface Comparable
 * para sobre escribir el metodo CompareTo. Esta interfaz impone un ordenamiento
 * total sobre los objetos de cada clase que la implementa. Este ordenamiento se
 * conoce como el ordenamiento natural de la clase , y el método compareTo de la
 * clase se conoce como su método de comparación natural .
 */
public class Producto implements Comparable<Producto> {

    private String nombre;
    private String litros;
    private String precio;

    public Producto() {
    }

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     *
     * @param nombre: nombre generico de un producto
     * @param litros: unidades del contenido de un producto
     * @param precio: costo de un producto
     */
    public Producto(String nombre, String litros, String precio) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        //Formato de salida: Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
        return "Nombre: " + nombre + " /// Litros: " + litros + 
                " /// Precio: $" + precio;
    }

    @Override
    public int compareTo(Producto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
