
public class Doctor extends Worker {
	
	public Doctor()
	{
		m_work = "I Dissect the human body and check for errors.";
	}

	public static void main(String[] args)
	{
		Doctor rLyons = new Doctor();
		rLyons.doWork();
		 
		Lawyer pPrice = new Lawyer();
		pPrice.doWork();
		
		Programmer kCalloway = new Programmer();
		kCalloway.doWork();
		
		Surgeon donnap = new Surgeon();
		donnap.doWork();
		
		WebProgrammer dEllis = new WebProgrammer();
		dEllis.doWork();
	}
	
	
}

