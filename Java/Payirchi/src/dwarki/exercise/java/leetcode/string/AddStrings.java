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

		String greater;
		String lesser;

		if (num1.length() > num2.length()) {
			greater = num1;
			lesser = num2;
		} else {
			greater = num2;
			lesser = num1;
		}

		Integer sumOfDigits, greaterDigit, lesserDigit, flag = 0;

		String reverseSum = "";

		for (int i = 0; i < greater.length(); i++) {

			sumOfDigits = 0;

			greaterDigit = greater.charAt(greater.length() - (i + 1)) - 48;

			if (i < lesser.length()) {

				lesserDigit = lesser.charAt(lesser.length() - (i + 1)) - 48;
				sumOfDigits = greaterDigit + lesserDigit;

				if (flag == 1)
					sumOfDigits = sumOfDigits + 1;

				if (sumOfDigits <= 9) {
					reverseSum = reverseSum.concat(sumOfDigits.toString());
					flag = 0;
				} else {
					sumOfDigits = sumOfDigits % 10;
					reverseSum = reverseSum.concat(sumOfDigits.toString());
					flag = 1;
				}

				if (flag == 1 && i == greater.length() - 1)
					reverseSum = reverseSum.concat("1");

			} else {

				sumOfDigits = sumOfDigits + greaterDigit;

				if (flag == 1)
					sumOfDigits = sumOfDigits + 1;

				if (sumOfDigits < 9) {
					reverseSum = reverseSum.concat(sumOfDigits.toString());
					flag = 0;
				} else {
					sumOfDigits = sumOfDigits % 10;
					reverseSum = reverseSum.concat(sumOfDigits.toString());
					flag = 1;
				}

				if (flag == 1 && i == greater.length() - 1)
					reverseSum = reverseSum.concat("1");
			}

		}

		String resultantSum = reverse(reverseSum);

		System.out.println(resultantSum);

		return resultantSum;
	}

	private static String reverse(String reverseSum) {

		String result = "";

		for (int i = reverseSum.length() - 1; i >= 0; i--) {
			result = result.concat(String.valueOf(reverseSum.charAt(i)));
		}

		return result;
	}

}
