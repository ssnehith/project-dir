package assign2;

import java.util.Scanner;

public class TryFinally {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of i");
		int i=sc.nextInt();
		System.out.println("enter value of j");
		int j=sc.nextInt();
			try {
			int k=i/j;	
			System.out.println("Output of k is"+k);

			}
			catch(ArithmeticException a) {
				System.out.println("arithmatic exception");
			}
			catch(NullPointerException n) {
				System.out.println("null pointer exception");
			}
			catch(Exception e) {
				System.out.println("exception");
			}
			finally {
				int l=i+j;
				System.out.println("finally block does addition :"+l);
			}
		}
}
