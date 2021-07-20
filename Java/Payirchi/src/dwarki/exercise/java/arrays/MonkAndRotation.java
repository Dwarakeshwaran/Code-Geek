package dwarki.exercise.java.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//17:10 15-07-2021
public class MonkAndRotation {

	public static void rotateList(int[] array, Integer rotation) {


		int rotationConstant = array.length-(rotation%array.length);

		for (int i = 0; i < array.length; i++) {

			// getting the constant value of array Size and the rotation count
			// rotating the index of the array using the flag
			// getting the rotatedIndex
			Integer rotatedIndex = (i+rotationConstant) % array.length;

			StringBuffer rotatedValue = new StringBuffer();

			System.out.print(rotatedValue.append(array[rotatedIndex] + " ").toString());
			
		}
		System.out.println("");

	}

	public static void main(String args[]) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		Integer testCases = Integer.parseInt(reader.readLine());
		Integer numberCount;
		int rotationCount;
		
		
		for (int iteration = 0; iteration < testCases; iteration++) {
			
			String temp[] = reader.readLine().split(" ");
			
			numberCount = Integer.parseInt(temp[0]);
			rotationCount = Integer.parseInt(temp[1]);
			
			int[] numberList = new int[numberCount];
			
			numberList = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			rotateList(numberList, rotationCount);

		}
			

	}

}
