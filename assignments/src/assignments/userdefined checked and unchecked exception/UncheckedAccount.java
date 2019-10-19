package assign2;

import java.util.Scanner;

public class UncheckedAccount {
	public void uncheckedWithdraw(int b)
	{
		int money=b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdrawl money");
		int withdrawl=sc.nextInt();
		if (money<withdrawl) {
				throw new UncheckedinsufficientBalanceException();
		}
		else {
			int remainingBalance=money-withdrawl;
			System.out.println("remainingBalance="+remainingBalance);
		}
}
}