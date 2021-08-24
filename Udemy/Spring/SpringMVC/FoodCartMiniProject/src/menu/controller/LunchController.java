package menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import menu.data.LunchService;
import menu.model.Lunch;

@Controller
@RequestMapping("lunch")
public class LunchController {

	@Autowired
	private LunchService service;

	@RequestMapping("/{item}")
	@ResponseBody
	public String getOneItemInfo(@PathVariable String item) {

		for (Lunch i : service.getLunchItems()) {

			if (i.getItemName().toLowerCase().equals(item.toLowerCase()))
				return "The Lunch item is " + i.getItemName() + " and it's price is " + i.getPrice();
		}

		return "No Lunch Items Found";

	}

}
