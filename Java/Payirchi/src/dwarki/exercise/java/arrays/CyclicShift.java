package dwarki.exercise.java.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Started @16:22 16-07-2021
//Ended @17:45 16-07-2021
public class CyclicShift {

	public static String binaryShift(String binary, int shifts, int bits) throws Exception {

		if (bits == binary.length()) {
			char[] firstSubString = new char[bits - shifts];
			char[] secondSubString = new char[shifts];

			for (int i = shifts; i < bits; i++)
				firstSubString[i - shifts] = binary.charAt(i);

			for (int i = 0; i < shifts; i++)
				secondSubString[i] = binary.charAt(i);

			StringBuffer shiftedString = new StringBuffer(String.valueOf(firstSubString).trim());
			shiftedString.append(String.valueOf(secondSubString));

			return shiftedString.toString().trim();
		} else 
			throw new Exception("Size of the String doesn't match.");

	}

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Integer testCases = Integer.parseInt(reader.readLine());

		Integer numberOfBits = null;
		Integer numberOfShifts = null;

		while (testCases-- > 0) {

			String arr[] = reader.readLine().split(" ");

			numberOfBits = Integer.parseInt(arr[0]);
			numberOfShifts = Integer.parseInt(arr[1]);

			/*
			 * int[] binaryNumber = new int[numberOfBits]; binaryNumber =
			 * Arrays.stream(reader.readLine().trim().split("")).mapToInt(Integer::parseInt)
			 * .toArray();
			 */

			Integer satisficationCount = 0;
			String binaryString = reader.readLine();

			String ShiftedString = binaryString;
			Integer count = 0;

			while (satisficationCount < numberOfShifts) {
				ShiftedString = binaryShift(ShiftedString, numberOfShifts, numberOfBits);

				// System.out.println(ShiftedString);

				if (Integer.parseInt(ShiftedString, 2) == Integer.parseInt(binaryString, 2))
					++satisficationCount;

				++count;

			}

			System.out.println(count - (satisficationCount - 1));

		}

	}

}
