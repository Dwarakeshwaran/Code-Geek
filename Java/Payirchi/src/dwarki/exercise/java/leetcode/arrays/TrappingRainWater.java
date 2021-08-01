package dwarki.exercise.java.leetcode.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//2nd Version
public class TrappingRainWater {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		System.out.println(trap(intArray));
	}

	public static int trap(int[] height) {
		
		int[] maxLeft = new int[height.length]; 
		int[] maxRight = new int[height.length];
		
		maxLeft[0] = 0;
		maxRight[height.length-1] = 0;
		
		int leftMax = height[0];
		
		//Finding maximum Left Side Value of the Current Array
		for(int i=1; i<height.length; i++) {
			
			if(height[i] < leftMax)
				maxLeft[i] = leftMax;
			else
				leftMax = height[i];	
		}
		
		int rightMax = height[height.length-1];
		
		//Finding maximum Right Side Value of the Current Array
		for(int i=height.length-2; i>=0; i--) {
			
			if(height[i] < rightMax)
				maxRight[i] = rightMax;
			else
				rightMax = height[i];

		}
		
		int trapWaterSum = 0;
		
		
		//Current Bar Height Should be between it's maxLeft and maxRight
		//and subtract it with the Minimum of maxLeft and maxRight to get the 
		//Trapping capacity of that current bar.
		for(int i=0; i< height.length; i++) {
			
			if(maxLeft[i] > height[i] && height[i] < maxRight[i])				
				trapWaterSum += minimumOf(maxLeft[i], maxRight[i]) - height[i];
			
		}
		
		return trapWaterSum;

	}
	
	public static int minimumOf(int number1, int number2) {
		return number1<number2?number1:number2;
	}

}