package repositoio;

import modelos.Persona;
import java.util.HashMap;
import java.util.Map;

public class RepositorioPersona {

	private Map<String, String> db = new HashMap();

	public String crearPersona(Persona persona) {
		db.put(persona.getRut(), persona.getNombre());
		return "OK";
	}

	public String actualizarPersona(Persona persona) {
		db.put(persona.getRut(), persona.getNombre());
		return "OK";
	}

	public Map<String, String> listarPersonas() {
		return db;
	}

	public String eliminarPersona(Persona persona) {
		db.remove(persona.getRut());
		return "OK";
	}

}
