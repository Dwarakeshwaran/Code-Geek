package hash_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	
	public int NoOfBooks;
	public int signupTime;
	public int shippingTime;
	public int[] books;
	
	public void collectLibraryDetail(Library lib)
	{
		List<Library> libList = new ArrayList<Library>();
		libList.add(lib);
		
		System.out.println(libList);
	}
	
	
	@Override
	public String toString() {
		return "Library [NoOfBooks=" + NoOfBooks + ", signupTime=" + signupTime + ", shippingTime=" + shippingTime
				+ ", books=" + Arrays.toString(books) + "]";
	}
	
	
	

}
