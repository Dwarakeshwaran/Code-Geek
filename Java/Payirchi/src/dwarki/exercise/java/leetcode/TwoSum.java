package dwarki.exercise.java.leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @ 16:53 20-07-2021
//Ended @ 17:06 20-07-2021
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		int sum;

		// using O(n^2) Time Complexity
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				sum = nums[i] + nums[j];

				// System.out.println("[" + nums[i] + "," + nums[j] + "]");
				if (sum == target)
					return new int[] { i, j };

				sum = 0;
			}
		}

		return null;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] numArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int target = Integer.parseInt(reader.readLine());

		for (int i : twoSum(numArray, target)) System.out.print(i + " ");
			

	}

}
