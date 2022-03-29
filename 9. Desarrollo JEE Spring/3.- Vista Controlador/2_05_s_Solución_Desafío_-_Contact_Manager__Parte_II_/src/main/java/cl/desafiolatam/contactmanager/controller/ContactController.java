package cl.desafiolatam.contactmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.service.ContactService;

@Controller
@RequestMapping(value="/contactManager")
public class ContactController {
	@Autowired
	private ContactService contactService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getContactList(ModelMap model) {
		
		model.put("listContact", contactService.getContactList());
		
		return "contactManager";
	}
	
	@RequestMapping(value="/addContact", method = RequestMethod.POST)
	public String addContact(ModelMap model, @ModelAttribute("contact") Contact contact) {
		contactService.addContact(contact);
		model.put("listContact", contactService.getContactList());
		return "contactManager";
	}
	
	@RequestMapping(value="/deleteContact", method = RequestMethod.GET)
	public String deleteContact(ModelMap model, @RequestParam("id") int id) {
		contactService.deleteContact(id);
		model.put("listContact", contactService.getContactList());
		return "contactManager";
	}
	
}
