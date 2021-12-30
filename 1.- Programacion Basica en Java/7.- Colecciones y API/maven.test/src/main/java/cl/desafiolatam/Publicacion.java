package cl.desafiolatam;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Publicacion {

	// Atributos de la clase Publicacion
	private Integer userId;
	private Integer id;
	private String title;
	private String body;

	// Metodos Get y Set de los atributos
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	// Metodo Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Obtener listado de comentarios desde API");

		// Inicializacion de cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("comments");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos
		// ejecutar un get
		Response respuestaPublicaciones = invocationBuilder.get();

		System.out.println("STATUS -->" + respuestaPublicaciones.getStatus());

		System.out.println("HEADERS -->" + respuestaPublicaciones.getHeaders());

		// A la respuest le pedimos que lea la información
		List<Comentarios> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Comentarios>>() {
		});

		// System.out.println(listaPublicaciones);

		// Largo de elementos en lista de comentarios
		System.out.println(listaPublicaciones.size());

		
		// Recorre la lista de Comentarios
		for (int x = 0; x < listaPublicaciones.size(); x++) {

			String title = listaPublicaciones.get(x).getEmail();

			System.out.println("ID --> " + listaPublicaciones.get(x).getId());
			System.out.println("POSICION -> " + x + " -- " + title);
			System.out.println("OTRO VALOR -->" + listaPublicaciones.get(x).getBody());
			System.out.println("--------------");

		}

		
	}

	@Override
	public String toString() {
		return "Publicacion [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
