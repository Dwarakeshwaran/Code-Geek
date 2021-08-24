package menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import menu.data.DinnerService;
import menu.model.Dinner;

@Controller
@RequestMapping("/dinner")
public class DinnerController {

	@Autowired
	private DinnerService service;

	@RequestMapping("/{item}")
	@ResponseBody
	public String getOneItemInfo(@PathVariable String item) {

		for (Dinner i : service.getDinnerItems()) {

			if (i.getItemName().toLowerCase().equals(item.toLowerCase()))
				return "The Dinner item is " + i.getItemName() + " and it's price is " + i.getPrice();
		}

		return "No Dinner Items Found";

	}

}
