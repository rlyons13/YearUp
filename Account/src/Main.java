
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Account savingsAccount = new Account (123, "Savings", 456, 900.00);
		savingsAccount.UpdateAmountSecurely (500, "admin");
		savingsAccount.UpdateAmountSecurely (0, "thief");
		savingsAccount.UpdateAmountSecurely (0, null);
		savingsAccount.UpdateAmountSecurely (0, "null");
		savingsAccount.UpdateAmountSecurely (0,"");
		
		
//		savingsAccount.m_amount = 900;
		
		System.out.println("Updated amount in account id " + savingsAccount.GetAccountId() + " to " + savingsAccount.GetAmount());
	

	}
}


