package assign2;
import java.util.ArrayList;
import java.util.Scanner;

public class Odd {
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(sc.nextInt());

        numbers.add(sc.nextInt());

        numbers.add(sc.nextInt());

        numbers.add(sc.nextInt());

        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());


        numbers.removeIf( n -> n%2 == 1 );
         
        System.out.println(numbers);
    }
}
