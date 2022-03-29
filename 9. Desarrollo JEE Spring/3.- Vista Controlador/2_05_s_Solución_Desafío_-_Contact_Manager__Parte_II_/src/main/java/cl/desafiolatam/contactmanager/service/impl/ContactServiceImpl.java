package cl.desafiolatam.contactmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.service.ContactService;

@Service("contactService")
public class ContactServiceImpl implements ContactService {
	@Autowired
	Contact contact;

	private List<Contact> listContact;

	public ContactServiceImpl() {
		super();
		listContact = new ArrayList<Contact>();

	}

	@Override
	public List<Contact> getContactList() {
		// TODO Auto-generated method stub
		if (contact.getIdContact() > 0) {
			listContact.add(contact);
		}

		return listContact;
	}

	@Override
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		int idMayor = 0;
		if (contact != null) {
			if (listContact.size() == 0) {
				contact.setIdContact(listContact.size() + 1);
			} else {
				for (Contact contact2 : listContact) {
					if (contact2.getIdContact() > idMayor) {
						idMayor = contact2.getIdContact();
					}
				}
				contact.setIdContact(idMayor + 1);
			}

		}

		listContact.add(contact);
	}

	@Override
	public void deleteContact(int id) {
		// TODO Auto-generated method stub
		for (Contact contact : listContact) {
			if (contact.getIdContact() == id) {
				listContact.remove(contact);
				break;
			}
		}
		contact = new Contact();
	}

}
