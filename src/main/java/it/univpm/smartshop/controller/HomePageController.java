package it.univpm.smartshop.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping({"/", "/homepage"})
public class HomePageController
{
    String appName = "SmartShop";
    
    @RequestMapping(method = RequestMethod.GET)
    public String HomeController(Locale locale, Model model)
    {
    	
	Date date = new Date();
	DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

	String formattedDate = dateFormat.format(date);

	model.addAttribute("serverTime", formattedDate);
	model.addAttribute("appName", appName);

	//System.out.println("Home Page Requested, locale = " + locale + " " + formattedDate + " " + appName);
	
	System.out.println("Home Page Requested");
	
	return "homepage";
    }
}
