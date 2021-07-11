package dwarki.google.kickstart.a2020;

import java.util.Scanner;

public class HouseVaanguvom {
	
	public static Integer[] sortTheArray(Integer[] array) {
		
		int temp;
		
		for(int i=0 ; i<array.length ; i++) {
			for(int j=i+1 ; j<array.length ; j++) {
				if(array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		
		return array;
		
	}
	
	public static int countHouses(Integer[] array, int limit) {
		
		int count = 0;
		int sum = 0;
		
		for(int i=0 ; i<array.length ; i++) {
			if(sum <= limit) {
				count++;
				sum = sum + array[i];
			}
		}
		
		return count-1;
	}
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Integer numberOfHouses = scan.nextInt();
		Integer budget = scan.nextInt();
		
		Integer[] amountList = new Integer[numberOfHouses];
		
		for(int i=0 ; i<numberOfHouses ; i++)
			amountList[i] = scan.nextInt();
		
//		System.out.println(numberOfHouses + " " + budget + " ");
//		
//		for(int i=0 ; i<numberOfHouses ; i++)
//			System.out.print(amountList[i]);
		
		
		Integer[] sortedArray = new Integer[numberOfHouses];
		
		sortedArray = sortTheArray(amountList);
		
//		for(int i=0 ; i<numberOfHouses ; i++)
//			System.out.print(sortedArray[i] + " ");
		
		int buyHouses = countHouses(sortedArray, budget); 
		
		System.out.println(buyHouses);
	}

}
