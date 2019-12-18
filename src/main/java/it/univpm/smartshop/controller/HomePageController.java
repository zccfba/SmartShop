package it.univpm.smartshop.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomePageController
{
    @RequestMapping(value = "/HomePage", method = RequestMetod.GET)
    public String homeContent(Locale locale, Model model)
    {
    	System.out.println("Home Page Requested, locale = " + locale);
	
	Date date = new Date();
	DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

	String formattedDate = dateFormat.format(date);

	model.addAttribute("serverTime", formattedDate);
	
	String appName = "SmartShop";
	model.addAttribute("appName", appName);

	return "homepage";
    }
}
