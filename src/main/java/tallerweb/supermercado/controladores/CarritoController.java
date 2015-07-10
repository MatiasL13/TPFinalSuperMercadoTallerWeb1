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
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	@RequestMapping("/ver")
	public ModelAndView mostrarProductosCarrito() {

		List<Producto> productos = Carrito.getInstance().verProductos();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("productos", productos);
		modelAndView.setViewName("verCarrito");
		modelAndView.addObject("command",new Producto());
		return modelAndView;
	}
	
	@RequestMapping("/listarProductos")
	public ModelAndView mostrarStock() {

			Map<Producto,Integer> productosEnStock = Stock.getInstance().obtenerStock();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stock", productosEnStock);
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
		
        return "redirect:/carrito/listarProductos";
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
	

}
