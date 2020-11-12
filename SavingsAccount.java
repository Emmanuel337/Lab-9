 public class SavingsAccount extends BankAccount {
	
	private static double Rate = 2.5;
	private static int SavingsNumber = 0;
	private static String AccountNumber;
	
	
	
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
	}
	
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		SavingsNumber += 1;
	}
	
	public void postInterest()
	{
		Rate = (Rate/100.0)/12;
		setBalance((getBalance()*Rate) + getBalance());
	}
	
	public String getAccountNumber()
	{
		AccountNumber = super.getAccountNumber() + "-" + SavingsNumber;
		return AccountNumber;
	}

}
