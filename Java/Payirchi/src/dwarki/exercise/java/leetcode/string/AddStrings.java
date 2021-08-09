package dwarki.exercise.java.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddStrings {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String num1 = reader.readLine();
		String num2 = reader.readLine();

		addStrings(num1, num2);

	}

	public static String addStrings(String num1, String num2) {

		Integer sum = stringToInteger(num1) + stringToInteger(num2);

		System.out.println(sum.toString());
		
		//6913259244, 71103343

		return sum.toString();
	}

	public static int stringToInteger(String str) {

		int digit;

		int result = 0;

		for (int i = 0; i < str.length(); i++) {

			digit = (int) str.charAt(i) - 48;

			digit = digit * powerOfTen(str.length() - (i + 1));

			result = result + digit;

		}

		return result;
	}

	private static int powerOfTen(int number) {

		int power = 1;

		for (int i = 0; i < number; i++)
			power = power * 10;

		return power;
	}

}
