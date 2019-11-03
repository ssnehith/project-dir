package assignments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

	public BankAccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bank.xml");

	@Autowired
	public double withdraw(double withdraw) {

		BankAccount bankAccount1 = (BankAccount)applicationContext.getBean("customer");

		double g1 = bankAccount1.getAccountBalance();
		System.out.println(g1);
		if (g1 >= withdraw) {
			g1 = g1 - withdraw;

			System.out.println("\nmoney left after withdrawal : " + g1);

		} else {
			System.out.println("Insufficient Balance");
		}

		return g1;
	}

	public double deposit(double deposit) {
		// TODO Auto-generated method stub
		BankAccount bankAccount2 = (BankAccount)applicationContext.getBean("customer");
		double g2 = bankAccount2.getAccountBalance();
		deposit = deposit + g2;
		System.out.println("Account balance after deposit: " +deposit);
		return g2;
		
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return false;
	}


}
