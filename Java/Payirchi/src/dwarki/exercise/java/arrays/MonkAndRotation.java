package dwarki.exercise.java.arrays;

import java.util.Scanner;

//17:10 15-07-2021
public class MonkAndRotation {

	public static void rotateList(Integer[] array, Integer rotation) {

		Integer[] rotatedArray = new Integer[array.length];

		for (int i = 0; i < array.length; i++) {

			//I didn't rotate the loop rotation number of times
			//Instead I have changed the position of it by using the rotation count
			Integer rotatedIndex = (i + rotation) % array.length;

			rotatedArray[rotatedIndex] = array[i];

		}

		for (int i = 0; i < array.length; i++)
			System.out.print(rotatedArray[i] + " ");

	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		Integer testCases = scan.nextInt();
		Integer numberCount = scan.nextInt();
		Integer rotationCount = scan.nextInt();

		Integer[] numberList = new Integer[numberCount];

		for (int i = 0; i < numberCount; i++)
			numberList[i] = scan.nextInt();

		for (int i = 0; i < testCases; i++)
			rotateList(numberList, rotationCount);

		scan.close();

	}

}
