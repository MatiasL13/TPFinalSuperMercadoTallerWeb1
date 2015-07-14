package tallerweb.supermercado.modelo;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
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
@Before
public  void beforeTotales(){
	Producto producto = new Producto();
	producto.setNombre("remera");
	producto.setPrecio(20.0);
    Carrito.getInstance().agregarProducto(producto);
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
    	
    	for(int i=0; i<=1 ; i++){
    		Descuento descuento = new Descuento();
    		if (i==1)
    			descuento.setMonto(20.0);
    		else
    			descuento.setPorcentaje(20.0);
        	Carrito.getInstance().aplicarDescuento(descuento);
    	}
    	double total2 =   Carrito.getInstance().totalSinDescuentos();
        double total = Carrito.getInstance().totalAhorros();
    	double total3 =  Carrito.getInstance().total();
    	
        System.out.println("ahorros"+total + "sin "+total2 +"total"+total3);
    }
}

