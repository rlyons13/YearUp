
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radius =4, length =5, breadth =6;
		double circlearea = CalculateCircleArea(radius);
		double rectanglearea = CalculateRectangleArea(length,breadth);
		
		System.out.println("the area of the circle is:" + circlearea);
		System.out.println("the area of the rectangle is:" + rectanglearea);
	}
	
	static double CalculateCircleArea (int radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}
	static double CalculateRectangleArea (int length, int breadth)
	{
		double space = length*breadth;
		return space;

	}

}
