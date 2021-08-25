package menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import menu.data.BreakfastService;
import menu.model.Breakfast;

@Controller
public class BreakfastController {

	@Autowired
	private BreakfastService service;

	@RequestMapping("/breakfast/checkout")
	public String getOneItemInfo(@RequestParam String foodName, Model model) {

		Integer numberOfItems = 1;

		for (Breakfast i : service.getBreakfastItems()) {

			if (foodName.toLowerCase().equals(i.getItemName().toLowerCase())) {

				model.addAttribute("foodObject", i);
				model.addAttribute("totalItems", numberOfItems.toString());

				return "checkout";

			}
		}

		return "checkout";
	}

	@RequestMapping("/breakfast")
	public String getAllInfo(Model model) {

		model.addAttribute("heading", "Breakfast Info Page!");

		model.addAttribute("foodItems", service.getBreakfastItems());

		return "breakfast";
	}

}
