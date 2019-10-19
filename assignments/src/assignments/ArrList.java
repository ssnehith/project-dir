package assign2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class ArrList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> rv1= new ArrayList<String>(); 
 
     rv1.add(sc.nextLine()); 
     rv1.add(sc.nextLine()); 
     rv1.add(sc.nextLine()); 
     rv1.add(sc.nextLine()); 
     System.out.println(rv1);
     ListIterator<String> iterator = rv1.listIterator(4);
      System.out.println("Iterating in backward direction");
    while(iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }
	}

}
