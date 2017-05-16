package three.training.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/show-form")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm(HttpServletRequest request, Model model){
		String name = request.getParameter("studentName").toUpperCase();
		String result = "Yo! " + name;
		model.addAttribute("message", result);
		return "helloworld";
	}
		
}
