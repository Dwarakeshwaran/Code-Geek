package menu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import menu.model.Dinner;

@Component
public class DinnerService {

	public List<Dinner> getDinnerItems() {

		List<Dinner> items = new ArrayList<Dinner>();

		items.add(new Dinner("Parotta", 10));
		items.add(new Dinner("Chicken Fried Rice", 80));
		items.add(new Dinner("Chicken Noodles", 70));
		items.add(new Dinner("Kothu Parotta", 50));
		items.add(new Dinner("Kolambu Kalakki", 15));

		return items;

	}

}
