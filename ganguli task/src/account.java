
public class account {
	private double balance;
	private double interest_rate;
	
	public account(double balance)
	{
		this.balance=balance;
	}
	
	public void applyinterest()
	{
		balance+=balance*interest_rate;
	}
	public void withdraw(double amount)
	{
		balance-=amount;
	}
	public double getbalance()
	{
		return balance;
	}
    public void set_interest_rate(double interest_rate)
    {
		this.interest_rate=interest_rate;
	}

}
