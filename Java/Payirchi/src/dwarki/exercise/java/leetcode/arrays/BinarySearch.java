package dwarki.exercise.java.leetcode.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
	static int position = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] nums = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		int target = Integer.parseInt(reader.readLine());

		search(nums, target);

	}

	public static int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			int middle = (left + right) / 2;

			if (target == nums[middle])
				return middle;
			else if (target < nums[middle])
				right = middle - 1;
			else if (target > nums[middle])
				left = middle + 1;

			System.out.println(left + "--" + right);

		}
		return -1;

	}
}
