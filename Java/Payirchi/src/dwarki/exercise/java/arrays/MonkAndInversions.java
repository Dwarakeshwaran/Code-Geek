package dwarki.exercise.java.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Started at 17:33 15-07-2021
//Finished at 18:58 15-07-2021
//I gave up!
public class MonkAndInversions {
	

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		Integer testCases = scan.nextInt();
		Integer inversionSatisficationCount = 0;
		Integer[][] numberList = null;
		Integer matrixCount = null;

		for (int iterarion = 0; iterarion < testCases; iterarion++) {

			matrixCount = scan.nextInt();
			numberList = new Integer[matrixCount][matrixCount];

			for (int x = 0; x < matrixCount; x++)
				for (int y = 0; y < matrixCount; y++)
					numberList[x][y] = scan.nextInt();
			
			//Here Each value in the matrix is checked by all the other values
			//to meet the condition given in the question
			//p=i and q=j is used here to avoid duplicate inversions like below,
			//(1,2) and (2,1) are the same and it's avoided by using the above condition
			for(int i=0; i<matrixCount; i++)
				for(int j=0; j<matrixCount; j++)
					for(int p=i; p<matrixCount;p++)
						for(int q=j; q<matrixCount; q++)
							if(numberList[p][q]<numberList[i][j])
								inversionSatisficationCount++;
			
			list.add(inversionSatisficationCount);
			
			inversionSatisficationCount = 0;
		}
		for(Integer number: list)
			System.out.println(number);
		

		scan.close();

	}

}
