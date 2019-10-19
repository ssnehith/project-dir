package assign2;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
	public static void main(String[]args) 
    { 
		Scanner sc=new Scanner(System.in);
        HashSet<String> rv1= new HashSet<String>(); 
        rv1.add(sc.nextLine());
        rv1.add(sc.nextLine());
        rv1.add(sc.nextLine());
        rv1.add(sc.nextLine());

        System.out.println(rv1);
}
}