package assign2;

import java.util.Scanner;

public class Account{
public void withdraw(int a) throws insufficientBalanceException
{
	int money=a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter withdrawl money");
	int withdrawl=sc.nextInt();
	if (money<withdrawl) {
	
		throw new insufficientBalanceException();
	}
	else {
		int remainingBalance=money-withdrawl;
		System.out.println("remainingBalance="+remainingBalance);
	}
}
}