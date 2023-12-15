
public class savings_account extends account {

	
	public savings_account(double balance)
	{
		super(balance);
		super.set_interest_rate(0.04);
		
	}
	public void withdraw(double amount)
	{
		if(amount<super.getbalance())
		{
			super.withdraw(amount);
	}else {
		System.err.println("please input a value less than  "+super.getbalance());
	}
	}
}
