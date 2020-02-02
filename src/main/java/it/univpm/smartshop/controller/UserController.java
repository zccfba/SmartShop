package it.univpm.smartshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.univpm.smartshop.model.entities.User;

@RequestMapping(value = "/", method = RequestMethod.GET )
@Controller
public class UserController
{
    @RequestMapping(value = "/register", method = RequestMethod.GET )
    public String ShowRegistrationForm(Model model)
    {
	model.addAttribute(new User());
	
	return "registrationForm";
    }
    
}
