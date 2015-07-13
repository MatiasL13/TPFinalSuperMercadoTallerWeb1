package tallerweb.supermercado.modelo;

import java.util.LinkedList;
import java.util.List;

public class Carrito {

    private static Carrito instance = new Carrito();
    private List<Producto> productos = new LinkedList<Producto>();
    private List<Descuento> descuentos = new LinkedList<Descuento>();

    private Carrito() {
    }

    public static Carrito getInstance() {
        return instance;
    }

    /**
     * Elimina todos los productos del carrito.<br>
     */
    public void vaciar() {
       this.descuentos.clear();
       this.productos.clear();
    }

    /**
     * Agrega un producto al carrito.<br>
     * 
     * @param ingrediente
     */
    public void agregarProducto(Producto producto) {
        // Implementar
    	 this.productos.add(producto);
    }

    /**
     * Permite agregar un descuento que será aplicado al carrito.<br>
     * 
     * @param descuento
     */
    public void aplicarDescuento(Descuento descuento) {
        // Implementar
    	this.descuentos.add(descuento);
  }

    /**
     * Lista todos los productos que forman parte del carrito.<br>
     * 
     * @return
     */
    public List<Producto> verProductos() {
        // Implementar
        return this.productos;
    }

    /**
     * Devuelve el precio total del carrito aplicando descuentos si los hubiese,
     * primero aplica los descuentos de monto y luego los de porcentaje.<br>
     * 
     * @return
     */
    public Double total() {
        // Implementar
    	return totalSinDescuentos() - totalAhorros();
    }

    /**
     * Devuelve el precio sin descuentos del carrito.<br>
     * 
     * @return
     */
    public Double totalSinDescuentos() {
    	Double sum = 0.0;
       for (Producto ele : productos)
       {
    	   sum += ele.getPrecio(); 
       }
       return sum;
    }

    /**
     * Devuelve el dinero ahorrado gracias a los descuentos.<br>
     * 
     * @return
     */
    public Double totalAhorros() {
       Double totalSinDescuentos= totalSinDescuentos(); 
       Double totalAhorros = 0.0;
       for(Descuento ele : descuentos)
       {
    	  if( ele.getMonto() != null)
    		  totalAhorros += ele.getMonto();
    	  else
    		  totalAhorros += (totalSinDescuentos * ele.getPorcentaje())/100;
       }	
        return totalAhorros;

    }
}
