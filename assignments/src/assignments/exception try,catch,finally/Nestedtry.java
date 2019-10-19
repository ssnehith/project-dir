package assign2;

import java.util.Scanner;

public class Nestedtry {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of i");
		int i=sc.nextInt();
		System.out.println("enter the value of j");
		int j=sc.nextInt();
			try {
			int k=i/j;	
			System.out.println("value of k is"+k);
			try {
				int l=j/i;
				System.out.println("value of l"+l);
			}
			catch(ArithmeticException a) {
				System.out.println("Arithmatic excepption 1");
			}
			catch(Exception b) {
				System.out.println("exception");
			}
			}
			catch(ArithmeticException c) {
				System.out.println("arithmatic exception 2");
			}
		}
}
