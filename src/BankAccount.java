public class BankAccount {
	
	private String accountNumber;
	private int balance;
	
	public int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Failed due to insufficient funds. Please top up to withdraw.");
			return balance;
		} else {
			balance -= amount;
			System.out.println("Withdrawal of Ksh." + amount + " was successful");
			return balance;
	}
	}
	
	public int deposit(int amount) {
		balance += amount;
		System.out.println("Deposit of Ksh." + amount + " was successful");
		return balance;
	}
	
	public int transfer(int amount) {
		if (balance < amount) {
			System.out.println("Failed due to insufficient funds. Please top up to transfer.");
			return balance;
		} else {
			balance -= amount;
			System.out.println("Transfer of Ksh." + amount + " was successful");
			return balance;
	}	
	}
	
	public int purchase(int amount) {
		if (balance < amount) {
			System.out.println("Failed due to insufficient funds. Please top up to purchase.");
			return balance;
		} else {
		balance -= amount;
		System.out.println("Purchase of Ksh." + amount + " was successful");
		return balance;
		}	
	}
	
	public void setBalance(int balance) {
		this.balance = balance;	
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.setBalance(100000);
		account.setAccountNumber("ACC100");
		
		System.out.println("Account:" + account.getAccountNumber());
		System.out.println("Initial Balance:" + account.getBalance());
		
		account.withdraw(2000);
		account.getBalance();
		System.out.println("Remaining Balance: Ksh." + account.getBalance());
		

	}

}
