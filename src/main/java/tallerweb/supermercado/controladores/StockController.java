package tallerweb.supermercado.controladores;


import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
@RequestMapping("/stock")
public class StockController {

	@RequestMapping("/ver")
	public ModelAndView mostrarPersonas() {

		Set<Producto> productosEnStock = Stock.getInstance().listarProductosDisponibles();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stock", productosEnStock);
		modelAndView.setViewName("stock");
		modelAndView.addObject("command",new Producto());

		return modelAndView;
	}
	
	@RequestMapping("/agregar")
	public ModelAndView cargarProductoAStock(){
		 return new ModelAndView("agregarProductoAStock", "command", new Producto());
	}
	
	@RequestMapping(value = "/agregar/ingresar", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("producto")
                            Producto producto, BindingResult result) {
		Integer id = 0;
		//id = TablaPersonas.getInstance().total();
		for (Producto ele :  Stock.getInstance().listarProductosDisponibles())
		{
			if (ele.getId() >= id )
				id = ele.getId() + 1;
		}
		/*if(producto.getId() != null){
			TablaPersonas.getInstance().modificarPersona(producto);
		}
		else{*/
			producto.setId(id);
			Stock.getInstance().agregarProducto(producto);
		//}
        return "redirect:";
    }

}
