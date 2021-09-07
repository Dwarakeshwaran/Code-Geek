package menu.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import menu.data.LunchService;
import menu.model.Lunch;

@Controller
@RequestMapping("/lunch")
public class LunchController {

	@Autowired
	private LunchService service;

	@RequestMapping("")
	public String getAllLunchItems(ModelMap model) {

		model.addAttribute("lunchItems", service.getLunchItems());

		return "lunch";
	}

	@RequestMapping("/cart")
	public String addToCart(@RequestParam String lName, @RequestParam String quantity, ModelMap model)
			throws ClassNotFoundException, SQLException {

		for (Lunch i : service.getLunchItems()) {

			if (i.getItemName().toLowerCase().equals(lName.toLowerCase())) {
				service.addLunchToDB(lName, quantity);
				model.addAttribute("lunch", 1);
				model.addAttribute("message", quantity + " " + lName + " added to the Cart");
				return "cart";
			} else
				model.addAttribute("message", "No Items Found");

		}

		return "cart";

	}

	@RequestMapping("/checkout")
	public String buyNow(ModelMap model) throws ClassNotFoundException, SQLException {

		HashMap<String, Integer> orderedItems = new HashMap<String, Integer>();

		try {
			orderedItems = service.getLunchData();
		} catch (SQLException e) {
			return "checkout";
		}

		List<String> foodList = new ArrayList<String>();
		List<Integer> quantityList = new ArrayList<Integer>();

		for (Map.Entry<String, Integer> entry : orderedItems.entrySet()) {

			foodList.add(entry.getKey());
			quantityList.add(entry.getValue());
		}

		Double sum = 0.0;

		for (int i = 0; i < foodList.size(); i++) {

			for (Lunch j : service.getLunchItems()) {

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

		service.deleteTable();

		return "checkout";
	}

}
