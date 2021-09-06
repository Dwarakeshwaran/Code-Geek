package dwarki.exercise.java.leetcode.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] nums = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		int target = Integer.parseInt(reader.readLine());

		search(nums, target);

	}

	public static int search(int[] nums, int target) {

		int middle = (int) Math.floor(nums.length / 2);

		if (middle == 0) {
			System.out.println(target + " is not available in this array :(");
			return 0;
		}

		if (nums[middle] == target || nums[0] == target || nums[nums.length - 1] == target)
			System.out.println(target + " is available in this array :)");
		else if (nums[middle] > target)
			search(IntStream.range(0, middle).map(i -> nums[i]).toArray(), target);
		else if (nums[middle] < target)
			search(IntStream.range(middle, nums.length - 1).map(i -> nums[i]).toArray(), target);

		return 0;

	}

}
