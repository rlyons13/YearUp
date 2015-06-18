
public class Cat extends Animal
{
	private int m_numberOfTails = -1;
	
	Cat()
	{
		m_description = "furry, loves tuna, good at jumping, sleeps a lot";
		m_foreLimbs = 2;
		m_hindLimbs = 2;
		m_numberOfTails = 1;
	}

	protected void AssignSound()
	{
		m_sound = "meow";
	}
	
	public static void main(String[] args)
	{
		Cat mrWhiskers = new Cat();
		System.out.println("Cats have so many legs : " + mrWhiskers.CountLegs());
		mrWhiskers.AssignSound();
		mrWhiskers.makesSound();
		
		Spider tarantula = new Spider();
		System.out.println("Spiders have so many legs : " + tarantula.CountLegs());
		tarantula.makesSound();
	}

}
