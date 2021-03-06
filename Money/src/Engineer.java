
public class Engineer implements ITaxPayer {
	
	double m_income =120000.00;
	private boolean m_donePayingTaxes = false;
	
	public Engineer (double income)
	{
		setIncome (income);
	}
	
	public double getIncome() 
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
			double newIncome = getIncome()- taxes;
			setIncome(newIncome);
			m_donePayingTaxes = true;
		}
		else
		{
			System.out.println ("Taxes for this year are already paid.");
		}
	}
	public void FileTaxReturn()
	{
		if(m_donePayingTaxes)
		{
			System.out.println("Engineer has filed tax return");
		}
		else
		{
			System.out.println("Engineer needs to pay taxes before filing ruturn");
		}
	}
	public static void main(String[] args)
	{
		Engineer madonnap = new Engineer (120000);
		madonnap.PayTaxes(.33);
		madonnap.FileTaxReturn();
		
		Astronut rosalynl = new Astronut (5000000);
		rosalynl.PayTaxes(.23);
		rosalynl.FileTaxReturn();
		
		Accountant donnac = new Accountant (1000000);
		donnac.PayTaxes(.38);
		donnac.FileTaxReturn();
		
		TaxAuditor james =new TaxAuditor();
		james.Audit(madonnap);
		james.Audit(rosalynl);
		james.Audit(donnac);
	}
}
