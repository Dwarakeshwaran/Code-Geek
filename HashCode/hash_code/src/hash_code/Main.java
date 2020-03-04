package hash_code;


import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	

	public int NoOfBooks;
	public int NoOfLibraries;
	public int NoOfDays;
	public int scannedLibraries;
	public int[] scores;
	public int[] libraryDetails;
	
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		try {
			Scanner inputScanner = new Scanner(new File("C:/Users/DwarakeshwaranBM/Downloads/Hash Code/a_example.txt"));
			Scanner submissionScanner = new Scanner(new File("C:/Users/DwarakeshwaranBM/Downloads/Hash Code/submissionFile.txt"));
			Library lib = new Library();
			
			
			
			main.NoOfBooks = Integer.parseInt(inputScanner.next());
			main.NoOfLibraries = Integer.parseInt(inputScanner.next());
			main.NoOfDays = Integer.parseInt(inputScanner.next());
			
			main.scores = new int[main.NoOfBooks];
			
			System.out.print(main.NoOfBooks + " ");
			System.out.print(main.NoOfLibraries + " ");
			System.out.println(main.NoOfDays);
			
			for(int score = 0 ; score < main.NoOfBooks ; score++)
			{
				main.scores[score] = Integer.parseInt(inputScanner.next()); 
			}
			
			for(int score : main.scores)
			{
				System.out.print(score + " ");
			}
			
			main.scannedLibraries = submissionScanner.nextInt();
			
			List<Library> libList = new ArrayList<Library>();
			
			
				for(int library = 0 ; library < main.scannedLibraries ; library++)
				{
					lib.NoOfBooks = inputScanner.nextInt();
					lib.signupTime = inputScanner.nextInt();
					lib.shippingTime = inputScanner.nextInt();
					
					lib.books = new int[lib.NoOfBooks];
					for(int book = 0 ; book < lib.NoOfBooks ; book++)
					{
						lib.books[book] = inputScanner.nextInt();
					}
					
					libList.add(lib);
					
				}
				
				System.out.println(libList.toString());
				
				
			
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
		
	


}