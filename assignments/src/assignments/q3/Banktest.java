package assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import assignments.BankAccount;
import assignments.BankAccountService;
import assignments.BankAccountServiceImpl;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Banktest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice :\n1.Withdraw\n2.Deposit\n3.Display\n4.transfer");
		int choice = sc.nextInt();
		BankAccountService service = new BankAccountServiceImpl();

		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("Bank.xml"); BankAccount bankAccount =
		 * (BankAccount)applicationContext.getBean("details");
		 */

		switch (choice) {

		case 1:
			System.out.println("Enter withdraw amount: ");
			double withdraw = sc.nextDouble();
			service.withdraw(choice, withdraw);
			break;

		case 2: 
			System.out.println("Enter Deposit amount: ");
			double deposit = sc.nextDouble();
			service.deposit(choice, deposit);
			break;
			
		case 3:
			ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("Bank.xml");
			BankAccount bankAccount1 = (BankAccount) applicationContext1.getBean("customer");
			bankAccount1.msg();
			bankAccount1.displayDetails();
		
	}
	}
}


