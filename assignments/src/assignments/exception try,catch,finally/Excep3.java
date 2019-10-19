package assign2;

import java.util.Scanner;

public class Excep3 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
		try {
		int k=i/j;	
		System.out.println(k);

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
	}
	
			}
		
	
