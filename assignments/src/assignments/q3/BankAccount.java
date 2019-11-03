package assignments;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private String accountType;
	@Autowired
	private double accountBalance;

	@Autowired
	public BankAccount(int accountId, String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Autowired
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void msg() {
		System.out.println("obj created");
	}

	public void displayDetails() {
		System.out.println(getAccountId() + "\n" + getAccountHolderName() + "\n" + getAccountType() + "\n" + getAccountBalance());
	}

}
