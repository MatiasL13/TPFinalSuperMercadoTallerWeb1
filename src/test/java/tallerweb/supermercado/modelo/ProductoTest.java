package tallerweb.supermercado.modelo;

import java.util.List;

import org.junit.Assert;

import org.junit.Test;

public class ProductoTest {

    @Test
    public void testVaciar() {
    	List<Producto> productos = Carrito.getInstance().verProductos();
     	Carrito.getInstance().vaciar();
        Assert.assertTrue(0 == productos.size());
    }
    
    @Test
    public void testAgregarProducto() {
    	Producto producto = new Producto();
    	List<Producto> productos = Carrito.getInstance().verProductos();
    	producto.setNombre("remeras");
    	producto.setPrecio(20.0);
        Carrito.getInstance().agregarProducto(producto);
        Assert.assertTrue(1 == productos.size());
    }

    @Test
    public void testAplicarDescuento() {
    	
    }

    @Test
    public void testVerProductos() {
    
    	
    	String nombre = "remeras";
    	Double precio = 20.0;
    	List<Producto> productos = Carrito.getInstance().verProductos();
        
        for (Producto ele : productos)
        {
        	Assert.assertTrue(precio == ele.getPrecio());
        	Assert.assertTrue(nombre == ele.getNombre());
        }
    
    }

    @Test
    public void testTotal() {
        // Implementar
    }

    @Test
    public void testTotalSinDescuentos() {
        // Implementar
    }

    @Test
    public void testTotalAhorros() {
        // Implementar
    }
}
