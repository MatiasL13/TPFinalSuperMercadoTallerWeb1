package tallerweb.supermercado.modelo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {

    @Test
    public void testVaciar() { // ultimo
    	List<Producto> productos = Carrito.getInstance().verProductos();
     	Carrito.getInstance().vaciar();
        Assert.assertTrue(0 == productos.size());
    }
    
    @Test
    public void testAgregarProducto() {// anteultimo
    	Producto producto = new Producto();
    	List<Producto> productos = Carrito.getInstance().verProductos();
    	producto.setNombre("remeras");
    	producto.setPrecio(20.0);
        Carrito.getInstance().agregarProducto(producto);
        Assert.assertTrue(2 == productos.size());
    }

    @Test
    public void testAplicarDescuento() { //segundo
    	for(int i=0; i<=1 ; i++){
    		Descuento descuento = new Descuento();
    		if (i==1)
    			descuento.setMonto(20.0);
    		else
    			descuento.setPorcentaje(20.0);
        	Carrito.getInstance().aplicarDescuento(descuento);
    	}
    }

    @Test
    public void testVerProductos() { // primero
    	Producto producto = new Producto();
    	
    	String nombre = "remeras";
    	Double precio = 40.0;
    	producto.setNombre(nombre);
    	producto.setPrecio(precio);
    	  Carrito.getInstance().agregarProducto(producto);
    	List<Producto> productos = Carrito.getInstance().verProductos();
        
        for (Producto ele : productos)
        {
        	Assert.assertTrue(precio == ele.getPrecio() && nombre == ele.getNombre());
        }
    
    }

    @Test
    public void testTotal() {
    
    	double total =  Carrito.getInstance().total();
    	System.out.println("total"+total);
    }

    @Test
    public void testTotalSinDescuentos() {
    	
    	double total =   Carrito.getInstance().totalSinDescuentos();
    	System.out.println("sin descuento"+total);
    }

    @Test
    public void testTotalAhorros() {
    	
    	
    	double total2 =   Carrito.getInstance().totalSinDescuentos();
        double total = Carrito.getInstance().totalAhorros();
    	double total3 =  Carrito.getInstance().total();
    	
        System.out.println("ahorros"+total );
    }
}

