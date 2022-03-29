import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.service.ContactService;
import cl.desafiolatam.contactmanager.service.impl.ContactServiceImpl;

public class MensajeServiceImpl2Test {

	private  ContactService contactService;
	public  Contact contact;

	@Before
	/*static void setUpBeforeClass() throws Exception {
		System.out.println("Previo a ejecución de test");
		contactService = new ContactServiceImpl();
		contact = new Contact();
	}*/

	@Test
	public void agregar_contacto() {
		
		Contact contact = new Contact();
		
		contact.setNombre("pruebas");
		contact.setApellidoPaterno("pruebas");
		contact.setApellidoMaterno("pruebas");
		contact.setDireccion("pruebas");
		contact.setTelefono(123456789);

		System.out.println("Esto es lo que se envia como data de contacto de Prueba: " + contact.toString());
		contactService.addContact(contact);
		System.out.println("Ya agrego contacto de prueba");
		
		assertEquals(1,contactService.getContactList().size(),0);

	}

}
