package dwarki.exercise.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Librarian {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>();

		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);

//		for(Integer n: number) {
//			System.out.println(n);
//		}

		List<Books> bList = new ArrayList<Books>();

		bList.add(new Books("DaVinci Code", "Dan Brown", "Thriller", 7, 500));
		bList.add(new Books("Mocking Jay", "Sussana Collins", "Fantasy Drama", 6, 300));
		bList.add(new Books("Vandhaargal Vendraargal", "Madhan", "Historical", 8, 250));
		bList.add(new Books("Prisoner of Azkaban", "J.K.Rowling", "Fantasy", 9, 400));
		bList.add(new Books("Vayadhu Vandhavargalukku Mattum", "Ki.Ra", "Short Stories", 10, 150));

		// Sorting using Comparator Interface
		Comparator<Books> bList2 = new Comparator<Books>() {

			@Override
			public int compare(Books b1, Books b2) {
				if (b1.getRating() < b2.getRating())
					return 1;
				else
					return -1;
			}
		};

		Collections.sort(bList, bList2);

		for (Books b : bList) {
			System.out.println(b);
		}

		System.out.println("");
		
		// Sorting using Lambda Expression

		Comparator<Books> bList3 = (b1, b2) -> {
			if (b1.getPrice() > b2.getPrice())
				return 1;
			else
				return -1;
		};

		Collections.sort(bList, bList3);

		for (Books b : bList) {
			System.out.println(b);
		}

		System.out.println("");

		// Sorting using Comparable Interface
		Collections.sort(bList);

		for (Books b : bList) {
			System.out.println(b);
		}

	}

}
