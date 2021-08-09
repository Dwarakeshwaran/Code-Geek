package dwarki.exercise.java.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AddStrings {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String num1 = reader.readLine();
		String num2 = reader.readLine();

		addStrings(num1, num2);

	}

	public static String addStrings(String num1, String num2) {

		BigInteger sum = stringToInteger(num1).add(stringToInteger(num2));

		System.out.println(sum.toString());
		
		//6913259244, 71103343
		
		//3876620623801494171, 6529364523802684779
	
		return sum.toString();
	}

	public static BigInteger stringToInteger(String str) {

		Integer digit;
		
		BigInteger powerDigit;

		BigInteger result = new BigInteger("0");

		for (int i = 0; i < str.length(); i++) {
			
			digit = (int) str.charAt(i) - 48;
			
			powerDigit = new BigInteger(digit.toString());

			powerDigit = powerDigit.multiply(powerOfTen(str.length() - (i + 1)));

			result = result.add(powerDigit) ;

		}

		return result;
	}

	private static BigInteger powerOfTen(long number) {

		BigInteger power = new BigInteger("1");

		for (int i = 0; i < number; i++)
			power = power.multiply(new BigInteger("10"));

		return power;
	}

}
