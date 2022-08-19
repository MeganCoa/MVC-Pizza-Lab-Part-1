package co.grandcircus.MVCWebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("animal")
	public String showAnimal(@RequestParam String type, 
							 @RequestParam String name, 
							 Model model) {
		
		model.addAttribute("type", type);
		model.addAttribute("name", name);
		 	
		return "displayanimal";
	}
	
	@RequestMapping("/animalform")
	public String showAnimalForm() {
		
		return "animalform";
	}
	
	@PostMapping("/animalform")
	public String submitAnimalForm(@RequestParam String type,
								   @RequestParam String name,
								   Model model) {
		
		model.addAttribute("type", type);
		model.addAttribute("name", name);
		
		return "displayanimal";
	}
}

