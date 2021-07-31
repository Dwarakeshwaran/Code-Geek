package dwarki.exercise.java.leetcode.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @22:04 31-07-2021
//Ended @22:49 31-07-2021
public class TrappingRainWater {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		System.out.println(trap(intArray));
	}

	public static int trap(int[] height) {

		int first = 0;

		int last = height.length - 1;

		int count = 0;

		while (true) {

			if (height[first] == 0)
				first++;

			if (height[last] == 0)
				last--;

			if (first == height.length || last == -1)
				break;

			while (height[first] != 0 && height[last] != 0) {
				for (int inner = first; inner <= last; inner++) {
					if (height[inner] == 0)
						count++;
					else
						height[inner] = height[inner] - 1;
				}
			}

		}

//		for (int i : height)
//			System.out.print(i + " ");

		return count;

	}

}
