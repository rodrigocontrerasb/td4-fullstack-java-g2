package cl.desafiolatam.contactmanager.service;

import java.util.List;

import cl.desafiolatam.contactmanager.model.Contact;

public interface ContactService {
	List<Contact> getContactList();
	void addContact(Contact contact);
	void deleteContact(int id);
}
