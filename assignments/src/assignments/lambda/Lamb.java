package assign2;

import java.util.Scanner;

public class Lamb {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        A add = (int x, int y) -> x + y; 
        A sub = (int x, int y) -> x - y; 
        A mul = (int x, int y) -> x * y; 
        A div = (int x, int y) -> x / y;
        System.out.println("addition of two number"+ add.operation(sc.nextInt(), sc.nextInt()));
        System.out.println("subtraction of two number"+sub.operation(sc.nextInt(), sc.nextInt()));
        System.out.println("multiplication of two number"+mul.operation(sc.nextInt(), sc.nextInt()));
        System.out.println("division of two number"+div.operation(sc.nextInt(), sc.nextInt()));

}
interface A 
{ 
    int operation(int a, int b); 
} 
}
