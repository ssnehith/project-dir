package assignments;
import java.util.Arrays; 
public class Sort {
	 public static int findIndex(int arr[], int t) 
	    { 
	  
	        int index = Arrays.binarySearch(arr, t); 
	        return (index < 0) ? -1 : index; 
	    } 
	 public static void main(String[] args) {
		 
	int i[]= new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	Arrays.sort(i);
	int intKey = 19;
	 System.out.println("Index position of 19 is: "  + findIndex(i, 19));

}
}