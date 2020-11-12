public class CheckingAccount extends BankAccount{
	
	private final static double Fee = 0.15;
	
	
	
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double amount)
	{
		amount = amount + Fee;
		return super.withdraw(amount);
	}

}

