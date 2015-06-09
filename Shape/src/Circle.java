
public class Circle implements IShape
{

		int m_radius;

		public double CalculateArea()
		{
			double area = m_radius * m_radius * 3.14;
			return area;
		}

		public double CalculatePerimeter()
		{
			double perimeter = 2 * 3.14 * m_radius;
			return perimeter;
		}

}


