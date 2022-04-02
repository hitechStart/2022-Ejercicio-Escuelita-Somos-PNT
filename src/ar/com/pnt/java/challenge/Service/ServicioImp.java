package ar.com.pnt.java.challenge.Service;

import ar.com.pnt.java.challenge.model.Bebida;
import ar.com.pnt.java.challenge.model.Fruta;
import ar.com.pnt.java.challenge.model.Higiene;
import ar.com.pnt.java.challenge.model.Producto;
import ar.com.pnt.java.challenge.model.TipoProducto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Maximiliano Di Ludovico
 * @version 1.0.1 ServicioImp:clase que implementa la interfaz que define los
 * metodos abstractos que presta la capa de servicios.
 *
 */
public class ServicioImp implements IServicio {

    private TipoProducto tipo;

    public void cargarProductosAListar(ArrayList<Producto> productos) {

        Pattern pat1 = Pattern.compile("(^[[a-zA-Z]+(\\-|\\ )?]+)$");
        Pattern pat2 = Pattern.compile("^\\d+\\.?\\d*$");
        Pattern pat3 = Pattern.compile("^\\d+\\.?\\d*$");

        String nombre[] = {"Coca-Cola Zero", "Coca-Cola", "Shampoo Sedal", "Frutillas"};
        String contenido[] = {"1.5", "1.5", "500", "0"};
        String precio[] = {"20", "18", "19", "64"};

        for (int i = 0; i < nombre.length; i++) {

            Matcher mat1 = pat1.matcher(nombre[i]);
            Matcher mat2 = pat2.matcher(contenido[i]);
            Matcher mat3 = pat3.matcher(precio[i]);

            if (mat1.matches()) {
                if (mat2.matches() && mat3.matches()) {

                    switch (i) {
                        case 0:
                        case 1:
                            productos.add(new Bebida(nombre[i], contenido[i], precio[i]));
                            break;
                        case 2:
                            productos.add(new Higiene(nombre[i], contenido[i], precio[i]));
                            break;
                        case 3:
                            productos.add(new Fruta(nombre[i], precio[i], "kilo"));
                            break;
                        default:
                            System.out.println("Error en la cantidad de productos");
                            break;
                    }
                } else {
                    try {
                        throw new NumberFormatException();

                    } catch (NumberFormatException e) {
                        System.out.println(e + "\nError. Numero invalido");
                        System.exit(0);
                    }
                }
            } else {
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception
                            + "\nError. El nombre de un producto no esta bien escrito. Revise");
                    System.exit(0);
                }
            }
        }
    }

    public void listarProductos(ArrayList<Producto> productos) {

        String type = "";
        int i = 0;
        Iterator<Producto> products = productos.iterator();

        try {
            while (products.hasNext()) {
                String clase = "" + products.next().getClass();
                String[] option = clase.split("\\.");
                type = option[option.length - 1];
                tipo = TipoProducto.valueOf(type);

                switch (tipo) {
                    case Bebida:
                        System.out.println(productos.get(i));
                        break;
                    case Higiene:
                        System.out.println(productos.get(i));
                        break;
                    case Fruta:
                        System.out.println(productos.get(i));
                        break;
                    default:
                        System.out.println("Error. No es un tipo de producto");
                        break;
                }
                i++;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Desborde o elemento nulo");
            System.exit(0);
        }
    }

    public void ordenarProductosPorPrecio(ArrayList<Producto> productos) {
        productos.sort((s1, s2) -> s1.getPrecio().compareTo(s2.getPrecio()));
    }

    public void obtenerProductoCaroYBarato(ArrayList<Producto> productos) {

        System.out.println("=============================");
        System.out.println("Producto más caro: "
                + productos.get(productos.size() - 1).getNombre());
        System.out.println("Producto más barato: " + productos.get(0).getNombre());
    }
}
