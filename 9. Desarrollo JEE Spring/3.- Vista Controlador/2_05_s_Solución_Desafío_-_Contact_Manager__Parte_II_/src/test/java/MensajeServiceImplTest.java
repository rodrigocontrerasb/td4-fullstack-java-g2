import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.service.impl.ContactServiceImpl;

public class MensajeServiceImplTest {

	private Contact contact;
	private ContactServiceImpl contactService;

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
		contact = new Contact();
		contactService = new ContactServiceImpl();
	}

	@Test
	public void caso1_obtener_lista_mensajes() {
		System.out.println("En lista de Contacto");
		System.out.println("CASO 1 --> "+ contactService.getContactList());
		assertEquals(new ArrayList<Contact>(), contactService.getContactList());
	}

	@Test
	public void caso2_obtener_lista_contacto() {

		System.out.println("CASO 2");
		System.out.println("CASO 2 --> " + contactService.getContactList().size());
		assertEquals(0, contactService.getContactList().size());
	}

	@Test
	public void caso3_agregar_mensaje() {

		contact.setNombre("Pablito");
		contact.setDireccion("Calle 1");
		contactService.addContact(contact);
		assertEquals(contact, contactService.getContactList().get(0));
		// assertEquals(contact, contactService.addContact(contact));
	}

}
