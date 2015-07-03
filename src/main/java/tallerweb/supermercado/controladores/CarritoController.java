package tallerweb.supermercado.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Carrito;
import tallerweb.supermercado.modelo.Producto;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	@RequestMapping("/ver")
	public ModelAndView mostrarPersonas() {

		List<Producto> productos = Carrito.getInstance().verProductos();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("personas", productos);
		modelAndView.setViewName("verCarrito");

		return modelAndView;
	}

}
