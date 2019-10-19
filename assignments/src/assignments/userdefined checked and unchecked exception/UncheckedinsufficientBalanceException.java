package assign2;

public class UncheckedinsufficientBalanceException extends RuntimeException
//whenever class extends runtimeexception it becomes unchecked exception 
{
	public UncheckedinsufficientBalanceException() {
		super("insufficient balance");
	}
}
