package cl.desafiolatam.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/controladoruno")
public class ControladorUno {

	@RequestMapping(value = "/uno", method = RequestMethod.GET)
	public String Uno(ModelMap model) {
		return "pagina1";
	}
	
	@RequestMapping(value = "/dos", method = RequestMethod.GET)
	public String Dos(ModelMap model) {
		return "pagina2";
	}
	
	@RequestMapping(value = "/tres", method = RequestMethod.GET)
	public String Tres(ModelMap model) {
		return "pagina1";
	}

}
