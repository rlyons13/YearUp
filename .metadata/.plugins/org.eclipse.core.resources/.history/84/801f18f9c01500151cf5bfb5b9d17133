
public class Astronut implements ITaxPayer {
	
	double m_income =5000000.00;
	private boolean m_donePayingTaxes = false;
	
	public Astronut (double income)
	{
		setIncome (income);
	}
	
	public double getIncome () 
	{
	return m_income;
	}
	
	private void setIncome (double income)
	{
		m_income = income;
	}
	
	public void PayTaxes (double taxRate)
	{	
		if (m_donePayingTaxes)
		{
			double taxes = taxRate * getIncome();
			double newIncome = getIncome();
			setIncome(newIncome);
			m_donePayingTaxes = true;
		}
		else
		{
			System.out.println ("Taxes for this year are already paid.");
		}
	public void FileTaxReturn();
		if(m_donePayingTaxes)
		{
			System.out.println("Engineer has filed tax return");
		}
		else
		{
			System.out.println("Engineer needs to pay taxes before filing ruturn");
		}
	}
	
	
}
