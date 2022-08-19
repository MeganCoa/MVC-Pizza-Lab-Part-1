package co.grandcircus.demo.controller;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.demo.model.MagicPet;


@Controller
public class MagicPetController {
	
	private static final List<MagicPet> PETS = Collections.unmodifiableList(Arrays.asList(
			new MagicPet("Charlie", "unicorn", new ArrayList(Arrays.asList("snarkiness","lying", "cheater")), false, 42),
			new MagicPet("Franklin", "Turtle", new ArrayList(Arrays.asList("friendship","hide and seek prowess")), true, 6)
			));
	
	
	
	
	@RequestMapping("/magicpets")
	public String showAllPets(@RequestParam(required=false) String category, Model model) {
		List<MagicPet> myPets; 
		
		if(category==null || category.isBlank()) {
			return "magicpets";
		} else if(category.equals("goog_boy")) {
			myPets = PETS.stream().filter(pet -> pet.getGood_boy() == true).toList();
		} else {
			myPets = PETS.stream().filter(pet -> pet.getGood_boy() == false).toList();
		}
		
		model.addAttribute("pets", myPets);
		return "magicpets";
	}
	
	@RequestMapping("/filter-pets")
	public String showFilterForm() {
		return "filter-pets";
	}
}
