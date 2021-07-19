/*
 * 1. getting the values of Decimal Values of Binary Number and storing it in ArrayList
 * 2. Getting the Maximum value from the List
 * 3. Counting the number of Maximum Binary Value in the list until it reaches the shift Limit
*/

package dwarki.exercise.java.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Started @16:22 16-07-2021
//Version 1 Ended @17:45 16-07-2021
//Version 2 Ended @15:45 19-07-2021 - Logic success. Time Limit is Exceeding.
public class CyclicShift {

	public static String binaryShift(String binary, int bits) throws Exception {

		if (bits == binary.length()) {
			char[] firstSubString = new char[bits - 1];
			char[] secondSubString = new char[1];

			for (int i = 1; i < bits; i++)
				firstSubString[i - 1] = binary.charAt(i);

			for (int i = 0; i < 1; i++)
				secondSubString[i] = binary.charAt(i);

			StringBuffer shiftedString = new StringBuffer(String.valueOf(firstSubString).trim());
			shiftedString.append(String.valueOf(secondSubString));

			return shiftedString.toString().trim();
		} else
			throw new Exception("Size of the String doesn't match.");

	}

	public static BigInteger binaryToDecimal(String binary) {

		char[] binaryString = new char[binary.length()];

		BigInteger decimal = new BigInteger("0");

		BigInteger binaryDigitValue;
		BigInteger binaryPowerValue;

		int counter = 1;

		for (int i = 0; i < binary.length(); i++)
			binaryString[i] = binary.charAt(i);

		for (int i = 0; i < binary.length(); i++) {

			binaryDigitValue = BigInteger.valueOf(Integer.parseInt(String.valueOf(binaryString[i])));
			binaryPowerValue = powerOf(binary.length() - counter);

			decimal = decimal.add(binaryDigitValue.multiply(binaryPowerValue));
			counter++;

			// System.out.println(binaryDigitValue);

		}

		return decimal;
	}

	public static BigInteger powerOf(int number) {
		BigInteger power = new BigInteger("1");

		BigInteger two = new BigInteger("2");

		for (int i = 0; i < number; i++)
			power = power.multiply(two);

		return power;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Integer testCases = Integer.parseInt(reader.readLine());

		Integer numberOfBits = null;
		Integer numberOfShifts = null;

		List<BigInteger> decimalValuesList = new ArrayList<BigInteger>();

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

			// 1. getting the values of Decimal Values of Binary Number and storing it in
			// ArrayList
			while (true) {

				ShiftedString = binaryShift(ShiftedString, numberOfBits);

				decimalValuesList.add(binaryToDecimal(ShiftedString));

				// System.out.println(binaryToDecimal(ShiftedString) + " " +
				// binaryToDecimal(binaryString));

				if (binaryToDecimal(ShiftedString).equals(binaryToDecimal(binaryString)))
					break;

			}

			BigInteger max = new BigInteger("0");

			// 2. Getting the Maximum value from the List
			max = Collections.max(decimalValuesList);

			// System.out.println(max);

			ShiftedString = binaryString;

			// 3. Counting the number of Maximum Binary Value in the list until it reaches
			// the shift Limit
			while (satisficationCount < numberOfShifts) {

				ShiftedString = binaryShift(ShiftedString, numberOfBits);

				//System.out.println(binaryToDecimal(ShiftedString) + " " + (count + 1));

				if (binaryToDecimal(ShiftedString).equals(max))
					satisficationCount++;

				count++;
			}
			if (count <= 2)
				System.out.println("0");
			else
				System.out.println(count);

		}

	}

}
