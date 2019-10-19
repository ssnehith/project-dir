package assign2;

import java.util.Scanner;

public class Autoclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a");
int a=sc.nextInt();
System.out.println("enter the value of b");
int b=sc.nextInt();
try(Div rv1=new Div()){
	int c=a/b;
	System.out.println(c);
	rv1.close();
}
catch(ArithmeticException e) {
	System.out.println(e);

}
try(Div1 rv2=new Div1()){
	rv2.close();
	int d=b/a;
	System.out.println(d);

}
catch(ArithmeticException e) {
	System.out.println(e);

}
	}

}
