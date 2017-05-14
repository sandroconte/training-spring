package three.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/show-form")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm(){
		return "helloworld";
	}
}
