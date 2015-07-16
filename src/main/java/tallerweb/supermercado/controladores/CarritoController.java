package tallerweb.supermercado.controladores;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Carrito;
import tallerweb.supermercado.modelo.Descuento;
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	@RequestMapping("/ver")
	public ModelAndView mostrarProductosCarrito() {
		
		List<Producto> productos = Carrito.getInstance().verProductos();
		double totalSinDescuentos = Carrito.getInstance().totalSinDescuentos();
		double totalAhorro = Carrito.getInstance().totalAhorros();
		double total = Carrito.getInstance().total();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("productos", productos);
		modelAndView.addObject("totalSinDescuentos", totalSinDescuentos);
		modelAndView.addObject("totalAhorro", totalAhorro);
		modelAndView.addObject("total", total);
		
		modelAndView.setViewName("verCarrito");
		modelAndView.addObject("command",new Producto());
		return modelAndView;
	}
	
	@RequestMapping("/confirmarCompra")
	public ModelAndView confirmarCompra() {
		
		List<Producto> productos = Carrito.getInstance().verProductos();
		double totalSinDescuentos = Carrito.getInstance().totalSinDescuentos();
		double totalAhorro = Carrito.getInstance().totalAhorros();
		double total = Carrito.getInstance().total();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("productos", productos);
		modelAndView.addObject("totalSinDescuentos", totalSinDescuentos);
		modelAndView.addObject("totalAhorro", totalAhorro);
		modelAndView.addObject("total", total);
		modelAndView.setViewName("confirmarCompra");
		//Carrito.getInstance().vaciar();
		return modelAndView;
	}
	
	@RequestMapping("/listarProductos")
	public ModelAndView mostrarStock(@RequestParam(required=false) boolean success) {
		String msjCargaOk = null;
		String status = "hidden";
		if(success){
			status = "";
			msjCargaOk = "Su producto fue agregado con exito";
		}

		Map<Producto,Integer> productosEnStock = Stock.getInstance().obtenerStock();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stock", productosEnStock);
		modelAndView.addObject("status", status);
		modelAndView.addObject("msjCargaOk", msjCargaOk);
		modelAndView.setViewName("agregarACarrito");
		modelAndView.addObject("command",new Producto());
		

		return modelAndView;
	}
	@RequestMapping(value = "/agregar/ingresar", method = RequestMethod.POST)
    public String agregarACarrito(@ModelAttribute("producto")	Producto producto, // se envia la clase Producto 
    								@RequestParam("cantidad") Integer cantidad, // se envia el paramtro cantidad
    								BindingResult result){
		cantidad = Stock.getInstance().comprarProducto(producto,cantidad);// metodo modificado para controlar stock negativo
		if(cantidad > 0);
			for(int i=0;i<cantidad;i++)
			{
				Carrito.getInstance().agregarProducto(producto);
			}
		
        return "redirect:/carrito/listarProductos?success=true";
		//this.mostrarStock(1);
    }
	
	@RequestMapping(value = "/vaciar")
    public String vaciarCarrito(){
		List<Producto> productos = Carrito.getInstance().verProductos();
		for(Producto ele : productos)
		{
			Stock.getInstance().agregarStock(ele, 1);
		}
				Carrito.getInstance().vaciar();
        return "redirect:/carrito/ver";
    }
	
	@RequestMapping(value = "/agregar/descuento", method = RequestMethod.POST)
    public String aplicarDescuento(@RequestParam("tipo") Integer tipo, // se envia la 
    								@RequestParam("cantidad") Double cantidad// se envia el paramtro cantidad
    							){
		Descuento descuento = new Descuento();
		if(tipo == 0)
			descuento.setPorcentaje(cantidad);
			
		else
			descuento.setMonto(cantidad);
		Carrito.getInstance().aplicarDescuento(descuento);
		
        return "redirect:/carrito/ver";
    }
	

}
