package assign2;

import java.util.Scanner;

public class FinallyTry {
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
			finally {
				int l=i+j;
				System.out.println("finally block does addition :"+l);
			}
		}
}
