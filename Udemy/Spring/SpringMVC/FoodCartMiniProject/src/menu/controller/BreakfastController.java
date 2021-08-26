package menu.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public String getOneItemInfo(Model model) throws ClassNotFoundException, SQLException {

		HashMap<String, Integer> orderedItems = new HashMap<String, Integer>();

		orderedItems = service.getDataFromDB();

		List<String> foodList = new ArrayList<String>();
		List<Integer> quantityList = new ArrayList<Integer>();

		for (Map.Entry<String, Integer> entry : orderedItems.entrySet()) {

			foodList.add(entry.getKey());
			quantityList.add(entry.getValue());
		}

		Double sum = 0.0;

		for (int i = 0; i < foodList.size(); i++) {

			for (Breakfast j : service.getBreakfastItems()) {

				if (foodList.get(i).toLowerCase().equals(j.getItemName().toLowerCase())) {

					Double price = quantityList.get(i) * j.getPrice();

					sum = sum + price;
				}
			}

		}

		model.addAttribute("food", foodList);
		model.addAttribute("quantity", quantityList);
		model.addAttribute("size", ((Integer) foodList.size()).toString());
		model.addAttribute("sum", sum.toString());

		return "checkout";
	}

	@RequestMapping("/breakfast/cart")
	public String addItemsToCart(@RequestParam String foodName, String numberOfItems, Model model)
			throws ClassNotFoundException, SQLException {

		for (Breakfast i : service.getBreakfastItems()) {

			if (foodName.toLowerCase().equals(i.getItemName().toLowerCase())) {

				service.insertFoodItemToDB(foodName, numberOfItems);

				model.addAttribute("message", numberOfItems + " " + foodName + "'s are added to Cart");

				return "cart";

			} else {

				model.addAttribute("message", "No Items Found");

			}
		}

		return "cart";
	}

	@RequestMapping("/breakfast")
	public String getAllInfo(Model model) {

		model.addAttribute("heading", "Breakfast Info Page!");

		model.addAttribute("foodItems", service.getBreakfastItems());

		return "breakfast";
	}

}
