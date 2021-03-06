package tallerweb.supermercado.controladores;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
@RequestMapping("/stock")
public class StockController {

	
	@RequestMapping("/ver")
	public ModelAndView mostrarStock() {

		Map<Producto,Integer> productosEnStock = Stock.getInstance().obtenerStock();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stock", productosEnStock);
	//	obtenerStock
		modelAndView.setViewName("stock");
		modelAndView.addObject("command",new Producto());
		

		return modelAndView;
	}
	
	@RequestMapping("/agregar")
	public ModelAndView cargarProductoAStock(){
		 return new ModelAndView("agregarProductoAStock", "command", new Producto());
	}
	
	@RequestMapping(value = "/agregar/ingresar", method = RequestMethod.POST)
    public String agregarAStock(@ModelAttribute("producto")
                            Producto producto, BindingResult result) {
		//Integer id = 0;
		//id = TablaPersonas.getInstance().total();
	/*	for (Producto ele :  Stock.getInstance().listarProductosDisponibles())
		{
			if (ele.getId() >= id )
				id = ele.getId() + 1;
		}*/
		/*if(producto.getId() != null){
			TablaPersonas.getInstance().modificarPersona(producto);
		}
		else{*/
			//producto.setId(id);
			Stock.getInstance().agregarProducto(producto);
		//}
        return "redirect:/stock/ver";
    }
	
	@RequestMapping(value = "/eliminarProductoStock", method = RequestMethod.POST)
	public String eliminarProductoStock(@ModelAttribute("producto")
							Producto producto, BindingResult result){
 
		Stock.getInstance().eliminarProducto(producto);
		return "redirect:/stock/ver";
	}
	
	@RequestMapping(value = "/agregarStock", method = RequestMethod.POST)
	public String agregarStock(@ModelAttribute("producto")	Producto producto, // se envia la clase Producto 
								@RequestParam("cantidad") Integer cantidad, // se envia el paramtro cantidad
								BindingResult result){
		
		Stock.getInstance().agregarStock(producto,cantidad);
		return "redirect:/stock/ver";
	}
	@RequestMapping(value = "/eliminarStock", method = RequestMethod.POST)
	public String eliminarStock(@ModelAttribute("producto")	Producto producto, // se envia la clase Producto 
								@RequestParam("cantidad") Integer cantidad, // se envia el paramtro cantidad
								BindingResult result){
		
		Stock.getInstance().comprarProducto(producto,cantidad);
		return "redirect:/stock/ver";
	}
	

}
