package com.desafiolatam.imdb.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.desafiolatam.imdb.model.User;
import com.desafiolatam.service.UserService;
import com.desafiolatam.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserValidator userValidator;
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model,
			@Valid @ModelAttribute("user") User user, BindingResult result) {
		if (error != null) {
			model.addAttribute("errorMessage", "Invalid credentials, please try again.");
		}
		if (logout != null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "login";
	}

	@GetMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "registration";
		} else {
			userService.saveWithUserRole(user);
			// userService.saveUserWithAdminRole(user);
			return "redirect:/login";

		}
	}

	@RequestMapping(value = { "/", "/home" })
	public String home(Principal principal) {
		return "redirect:/shows";
	}

}
