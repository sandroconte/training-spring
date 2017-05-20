package three.training.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import three.training.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
	
	@Value("#{languagesOptions}") 
    private Map<String, String> languagesOptions;
	
	@Value("#{systemsOptions}") 
    private Map<String, String> systemsOptions;	
	
	@RequestMapping("/show-form")
	public String showForm(Model models){
		models.addAttribute("student", new Student());
		models.addAttribute("countryOptions", countryOptions);
		models.addAttribute("languagesOptions", languagesOptions);
		models.addAttribute("systemsOptions", systemsOptions);
		return "student-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm(@ModelAttribute("student") Student student){
		
		System.out.println("student: " + student.getFirstName() + " "
				+ student.getLastName());
		return "student-confirm";
	}
	
}
