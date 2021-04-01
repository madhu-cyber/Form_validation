package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;

@Controller
public class CustomerController {

	
	@RequestMapping(value = "/customerForm")
	public String home(Model model) {
		model.addAttribute("customer", new Customer());
		return "customerForm.jsp";
	}
	
	@RequestMapping(value = "customerProcess")
	public String customerProcess(@Valid @ModelAttribute("customer") Customer customer,BindingResult result) {
		
		System.out.println(result);
		
		if(result.hasErrors()) {
			return "customerForm.jsp";
		}else {
			return "Customer_process.jsp";
		}
			
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
}
