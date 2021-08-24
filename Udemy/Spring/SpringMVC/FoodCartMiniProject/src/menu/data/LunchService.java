package menu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import menu.model.Lunch;

@Component
public class LunchService {
	
	public List<Lunch> getLunchItems(){
		
		List<Lunch> items = new ArrayList<Lunch>();
		
		items.add(new Lunch("Chicken Biriyani", 100));
		items.add(new Lunch("White Rice", 50));
		items.add(new Lunch("Variety Rice", 30));
		items.add(new Lunch("Pepper Chicken", 70));
		items.add(new Lunch("Empty Biriyani", 40));
		
		return items;
	}

}
