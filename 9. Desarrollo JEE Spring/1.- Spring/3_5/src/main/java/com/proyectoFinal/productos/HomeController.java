package com.proyectoFinal.productos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String Main(Model modelo) {
		String nombre = "src/main/resources/static/data.txt";
		ArrayList<String> p = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(nombre);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			while (data != null) {
				p.add(data);
				data = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			logger.error("Error leyendo el fichero " + nombre + ": " + e);
		}
		modelo.addAttribute("nombre1", p.get(0));
		modelo.addAttribute("nombre2", p.get(1));
		modelo.addAttribute("nombre3", p.get(2));
		return "main";
	}

}
