package assign2;

public class insufficientBalanceException extends Exception 
//whenver a class is created by extending Exception then it becomes checked exception
{
	public insufficientBalanceException() {
		super("insufficient balance");
	}

}
