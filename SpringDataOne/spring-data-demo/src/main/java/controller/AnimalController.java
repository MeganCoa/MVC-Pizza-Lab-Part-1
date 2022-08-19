package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import grandcircus.co.springdatademo.model.Animal;
import repository.AnimalRepository;

@Controller
public class AnimalController {
	
	@Autowired
	private AnimalRepository repo;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/animals";
	}
	
	@RequestMapping("/animals")
	public String listAnimals(Model model) {
		List<Animal> animals = repo.findAll();
		
		model.addAttribute("animals", animals);
		
		return "listAnimals";
	}
}
