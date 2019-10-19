package assign2;

public class Atm  {

	public static void main(String[] args) throws insufficientBalanceException {
		// TODO Auto-generated method stub
Account rv1=new Account();
UncheckedAccount rv2=new UncheckedAccount();
rv1.withdraw(10000);
rv2.uncheckedWithdraw(10000);
	}
	}


