package three.training.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import three.training.models.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/show-form")
	public String showForm(Model models){
		models.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult){
		
		if (bindingResult.hasErrors()){
			return "customer-form";
		}
		return "customer-confirm";
	}
}
