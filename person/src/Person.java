
public class Person 
{
		private String m_name;
		private int m_age;
		private String m_phonenumber;
		private String m_address;
	
	public Person(String name, String phonenumber, String address, int age)
	{
			 m_name = name;
			 m_phonenumber = phonenumber;
			 m_address = address;
			 m_age = age;
	}
	
	String GetName()
	{
			return m_name;
	}
			
	private void SetName(String name)
	{
			m_name = name;
	}
			
	public int GetAge()
	{
			return m_age;
	}
			
	private void SetAge(int age)
	{
			m_age = age;
	}
			
	public String GetPhonenumber()
	{
			return m_phonenumber;	
	}
			
	private void SetPhonenumber(String phonenumber)
	{
			m_phonenumber = phonenumber;
	}
			
	public String GetAddress()
	{
			return m_address;
	}
			
	private void Setaddress(String address)
	{
			m_address = address;
	}
			
	public double GrowsOlder(int age)
	{
		double Age = 1 + age;
		return Age;
	}
	

		

	 
	}


