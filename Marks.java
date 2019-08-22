import java.util.Scanner;

public class Marks
{
	public static void main(String[] args) {
	    int nos;
		int[] marks;
		int maximum;
		int sum;
		Scanner sc = new Scanner(System.in);
		
		nos = sc.nextInt();
	    marks = new int[nos];
		for(int i=0;i<nos;i++){
		    marks[i] = sc.nextInt();
		}
		
		//Find the maximum number
	
		maximum = marks[0];
		for(int i=0;i<nos;i++){
		    if(marks[i] > maximum)
		    maximum = marks[i];
		}
		System.out.println(maximum);
		
		//Find the Average of the Number
		sum = 0;
		for(int i=0; i<nos; i++){
		    sum = sum + marks[i];
		}
		System.out.println((double)sum/nos);
	}
}
