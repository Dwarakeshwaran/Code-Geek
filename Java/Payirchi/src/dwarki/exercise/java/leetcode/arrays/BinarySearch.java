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

		int place = binarySearch(nums, left, right, target);

		System.out.println(target + " exists in nums and its index is " + position);
		return place;

	}

	private static int binarySearch(int[] nums, int left, int right, int target) {

		int middle = (left + right) / 2;

		if (target < nums[middle])
			binarySearch(nums, left, middle - 1, target);
		else if (target > nums[middle])
			binarySearch(nums, middle + 1, right, target);
		else if (target == nums[left])
			position = left;
		else if (target == nums[right])
			position = right;
		else if (target == nums[middle])
			position = middle;

		if (middle == 0)
			return -1;
		else
			return position;

	}

}
