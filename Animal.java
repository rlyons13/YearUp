
public abstract class Animal 
{
	protected String m_description = null;
	protected int m_foreLimbs = -1;
	protected int m_hindLimbs = -1;
	protected String m_sound = null;
	
	protected void makesSound()
	{
		if (m_sound != null)
		{
			System.out.println(m_sound);
		}
	}
	
	protected int CountLegs()
	{
		return m_foreLimbs + m_hindLimbs;
	}

}
