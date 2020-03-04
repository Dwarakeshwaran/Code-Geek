package hash_code;

//First Step Finished
import java.util.Arrays;


public class Library {
	
	public int NoOfBooks;
	public int signupTime;
	public int shippingTime;
	public int[] books;
	
	
	
	@Override
	public String toString() {
		return "Library [NoOfBooks=" + NoOfBooks + ", signupTime=" + signupTime + ", shippingTime=" + shippingTime
				+ ", books=" + Arrays.toString(books) + "]";
	}
	
	
	

}