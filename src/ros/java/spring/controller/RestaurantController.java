package sk.itsovy.project.ros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import sk.itsovy.project.ros.entity.EntityRestaurant;
import sk.itsovy.project.ros.service.RestaurantService;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Controller
@RequestMapping("/list")
public class RestaurantController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@Autowired
	private RestaurantService restaurantService;


	@GetMapping("/list")
	public String showRestaurants(Model model) {
		List<EntityRestaurant> restaurantList = restaurantService.getRestaurants();
		model.addAttribute("restaurants", restaurantList);
		return "restaurants-list";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		EntityRestaurant newRestaurant = new EntityRestaurant();
		model.addAttribute("restaurant", newRestaurant);
		return "restaurant-form";
	}

	@PostMapping("/saveRestaurant")
	public String saveRestaurant(@Valid @ModelAttribute("restaurant") EntityRestaurant restaurant, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "restaurant-form";
		}
		else {
			restaurant.setRestaurantOwnerId(1);
			restaurant.setRestaurantTags("{\"tags\": [{\"title\": \"Burger\"}, {\"title\": \"Pizza\"}, {\"title\": \"Pasta\"}]}");
			restaurant.setRestaurantOpeningHours("{\"openingHours\": [{\"day\": \"Pondelok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Utorok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Streda\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Štvrtok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Piatok\", \"hours\": \"8:00 - 00:00\"}, {\"day\": \"Sobota\", \"hours\": \"12:00 - 00:00\"}, {\"day\": \"Nedeľa\", \"hours\": \"8:00 - 20:00\"}]}");
			restaurant.setRestaurantPhoneNumber("09101213");
			restaurant.setRestaurantAboutRestaurant("about");
			restaurantService.saveRestaurant(restaurant);
			return "redirect:/list/list";
		}

	}
}
