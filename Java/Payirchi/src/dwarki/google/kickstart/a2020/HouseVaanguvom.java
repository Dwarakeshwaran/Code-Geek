package dwarki.google.kickstart.a2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class HouseVaanguvom{
	
	static int countHouses(List<Integer> list, Integer limit) {
		
		int count = -1;
		int sum = 0;
		
		for(int i=0 ; i<list.size() ; i++) {
			if(sum <= limit) {
				count++;
				sum = sum + list.get(i);
			}
			else 
				break;
		}
		
		return count;
	}
	
	public static int main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		Integer numberOfHouses = scan.nextInt();
		Integer budget = scan.nextInt();
		
		List<Integer> amountList = new ArrayList<Integer>();
		
		for(int i=0 ; i<numberOfHouses ; i++)
			amountList.add(scan.nextInt());
		
		/*Sorting Using Anonymous Inner Class
		 * 
		 * amountList.sort(new Comparator<Integer>() { public int compare(Integer o1,
		 * Integer o2) {
		 * 
		 * return o1.compareTo(o2); } });
		 */
		
		amountList.sort((data1, data2) -> data1.compareTo(data2));
		
		int buyHouses =countHouses(amountList, budget);
		
		scan.close();
		
		return buyHouses;
		
		
	}

}
