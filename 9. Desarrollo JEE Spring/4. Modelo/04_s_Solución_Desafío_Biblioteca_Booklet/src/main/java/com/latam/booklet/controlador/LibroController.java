package com.latam.booklet.controlador;

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

import com.latam.booklet.modelo.Libro;
import com.latam.booklet.modelo.LibroAgregarForm;
import com.latam.booklet.service.LibroService;
import com.latam.booklet.vo.LibroVO;

@Controller
public class LibroController {

	private static final Logger log = LoggerFactory.getLogger(LibroController.class);

	@Autowired
	private LibroService svc;

	@GetMapping("/editarForm")
	public ModelAndView editarForm(Model model, @RequestParam Integer idLibro, RedirectAttributes ra) {
		LibroVO respuestaServicio = new LibroVO();
		respuestaServicio.setMensaje("No se pudo cargar la vista de edición, intente nuevamente.");
		respuestaServicio = svc.findById(idLibro);
		model.addAttribute("mensaje", respuestaServicio.getMensaje());
		model.addAttribute("VO", new LibroAgregarForm(respuestaServicio.getLibros().get(0)));
		return new ModelAndView("editar");
	}

	@PostMapping("/editar")
	public ModelAndView editar(@ModelAttribute LibroAgregarForm libro, RedirectAttributes ra) {
		LibroVO respuestaServicio = svc.update(new Libro(libro));
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
	public ModelAndView agregarSubmit(@ModelAttribute LibroAgregarForm libro, RedirectAttributes ra) {
		LibroVO respuestaServicio = svc.add(new Libro(libro));
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/home");
		} else {
			return new ModelAndView("redirect:/agregarForm");
		}
	}

	@GetMapping("/eliminar")
	public ModelAndView eliminar(Model model, @RequestParam String idLibro, RedirectAttributes ra) {
		LibroVO respuestaServicio = new LibroVO();
		respuestaServicio.setMensaje("No se pudo eliminar el libro, intente nuevamente.");
		try {
			Libro eliminado = new Libro();
			eliminado.setIdLibro(Integer.parseInt(idLibro));
			respuestaServicio = svc.delete(eliminado);
			ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
			return new ModelAndView("redirect:/home");
		} catch (Exception e) {
			log.error("Error en LibroController eliminar", e);
		}
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		respuestaServicio = svc.findAll();
		ra.addAttribute("VO", respuestaServicio);
		return new ModelAndView("redirect:/home");
	}

	@GetMapping("/cambiarDisponibilidad")
	public ModelAndView cambiarDisponibilidad(Model model, @RequestParam Integer idLibro,  RedirectAttributes ra) {
		LibroVO respuestaServicio = svc.changeAvailability(idLibro);
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		return new ModelAndView("redirect:/home");
	}

	@PostMapping("/buscar")
	public String agregarSubmit(Model model, @RequestParam String textoBuscado) {
		System.out.println(textoBuscado);
		LibroVO respuestaServicio = svc.findByTituloOrAutor(textoBuscado);
		model.addAttribute("mensaje", respuestaServicio.getMensaje());
		model.addAttribute("VO", respuestaServicio);
		return "home";
	}

	@GetMapping({ "/home" })
	public String home(Model model) {
		model.addAttribute("VO", svc.findAll());
		return "home";
	}


}