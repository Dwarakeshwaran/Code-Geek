package menu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import menu.model.Breakfast;

@Component
public class BreakfastService {

	public List<Breakfast> getBreakfastItems() {
		
		List<Breakfast> items = new ArrayList<Breakfast>();
		
		items.add(new Breakfast("Idly", 10));
		items.add(new Breakfast("Dosai", 15));
		items.add(new Breakfast("Poori", 20));
		items.add(new Breakfast("Pongal", 30));
		items.add(new Breakfast("Vadai", 5));

		return items;
	}

}
