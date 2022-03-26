package com.latam.logistiq.controlador;

import com.latam.logistiq.modelo.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.latam.logistiq.servicio.ProductoService;
import com.latam.logistiq.util.Util;
import com.latam.logistiq.vo.ProductoVO;

@Controller
public class ProductoController {

	private static final Logger log = LoggerFactory.getLogger(ProductoController.class);

	@Autowired
	private ProductoService svc;

	@GetMapping({ "/", "/home"})
	public String home(Model model, @RequestParam(defaultValue = "1") Integer p, @RequestParam(defaultValue = "5") Integer registros, @RequestParam(defaultValue = "") String busqueda) {
		log.info("model "+model);
		Integer totalPaginas = (int) svc.getPageCount(registros).getValor();
		model.addAttribute("paginas", Util.getArregloPaginas(p, totalPaginas));
		model.addAttribute("paginaActual", p);
		model.addAttribute("VO", svc.getPage(p-1, registros, busqueda));
		return "home";
	}

	@GetMapping("/editarForm")
	public ModelAndView editarForm(Model model, @RequestParam Integer idProducto, RedirectAttributes ra) {
		ProductoVO respuestaServicio = new ProductoVO();
		respuestaServicio.setMensaje("No se pudo cargar la vista de edición, intente nuevamente.");
		respuestaServicio = svc.findById(idProducto);
		model.addAttribute("mensaje", respuestaServicio.getMensaje());
		model.addAttribute("VO", respuestaServicio.getProductos().get(0));
		return new ModelAndView("editar");
	}

	@PostMapping("/editar")
	public ModelAndView editar(@ModelAttribute Producto producto, RedirectAttributes ra) {
		ProductoVO respuestaServicio = svc.update(producto);
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/home");
		} else {
			return new ModelAndView("redirect:/editarForm");
		}
	}

	@GetMapping("/agregarForm")
	public String agregarForm(Model model) {
		return "agregar";
	}

	@PostMapping("/agregar")
	public ModelAndView agregarSubmit(@ModelAttribute Producto producto, RedirectAttributes ra) {
		ProductoVO respuestaServicio = svc.add(producto);
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/home");
		} else {
			return new ModelAndView("redirect:/agregarForm");
		}
	}

	@GetMapping("/eliminar")
	public ModelAndView eliminar(Model model, @RequestParam Integer idProducto, RedirectAttributes ra) {
		ProductoVO respuestaServicio = new ProductoVO();
		respuestaServicio.setMensaje("No se pudo eliminar al usuario, intente nuevamente.");
		try {
			Producto eliminado = new Producto();
			eliminado.setIdProducto(idProducto);
			respuestaServicio = svc.delete(eliminado);
			ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
			return new ModelAndView("redirect:/home");
		} catch (Exception e) {
			log.error("Error en UsuarioController eliminar", e);
		}
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		respuestaServicio = svc.findAll();
		ra.addAttribute("VO", respuestaServicio);
		return new ModelAndView("redirect:/home");
	}

	
}
