package three.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
	
	@RequestMapping("/show-form")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm(
			@RequestParam("studentName") String name, Model model){		
		String result = "Yo! " + name.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
		
}
