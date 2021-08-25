package menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import menu.data.BreakfastService;
import menu.model.Breakfast;

@Controller
public class BreakfastController {

	@Autowired
	private BreakfastService service;

	@RequestMapping("/breakfast/{item}")
	@ResponseBody
	public String getOneItemInfo(@PathVariable String item) {

		for (Breakfast i : service.getBreakfastItems()) {

			if (i.getItemName().toLowerCase().equals(item.toLowerCase()))
				return "The Breakfast Item is " + i.getItemName() + " and it's price is " + i.getPrice();

		}

		return "No Breakfast Items Found";
	}

	@RequestMapping("/breakfast")
	public String getAllInfo(Model model) {

		model.addAttribute("heading", "Breakfast Info Page!");

		model.addAttribute("foodItems", service.getBreakfastItems());

		return "breakfast";
	}

}
