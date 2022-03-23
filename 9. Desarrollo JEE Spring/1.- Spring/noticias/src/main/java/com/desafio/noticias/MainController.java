package com.desafio.noticias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	private final static Logger logger = LoggerFactory.getLogger(MainController.class); 

	@RequestMapping("/")
    public String Main(Model modelo) {
		
    	String nombre = "src/main/resources/static/noticias.txt";
    	ArrayList<String> p = new ArrayList<String>();
    	
    	try {
    		
    		FileReader fr = new FileReader(nombre);
    		BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            while (data != null) {
            	p.add(data);
            	logger.info("Se ha añadido correctamente una noticia");
                data = br.readLine();
            }
            br.close();
            fr.close();
            
    	} catch (Exception e) {
    		logger.error("Error leyendo el fichero "+ nombre + ": " + e);
    	}

    	String noticia1[] = p.get(0).split("@@");
    	String noticia2[] = p.get(1).split("@@");
    	String noticia3[] = p.get(2).split("@@");
    	String noticia4[] = p.get(3).split("@@");
    	String noticia5[] = p.get(4).split("@@");

    	modelo.addAttribute("noticia1",noticia1);
    	modelo.addAttribute("noticia2",noticia2);
    	modelo.addAttribute("noticia3",noticia3);
    	modelo.addAttribute("noticia4",noticia4);
    	modelo.addAttribute("noticia5",noticia5);
        return "main";
        
    }
	
	
}