
public class balance_main {
	public static void main(String []args)
	{
		account janina=new savings_account(1300.0);
		janina.withdraw(1200.0);
		System.out.println("savings balance is:"+janina.getbalance());
		
	account ob=new current_account(1000.0);
	ob.withdraw(1200);
	System.out.println("current balance is:"+ob.getbalance());
		
	}

}
