public class Rectangle implements CutShapes
{
	double sideA, sideB;
	public Rectangle()
	{
		sideA = sideB = 0;
		
	}
	public Rectangle(double a, double b)
	{
		sideA = a;
		sideB = b;
	}
	
	public double getSideA()
	{
		return sideA;
		
	}
	
	public double getSideB()
	{
		return sideB;
	}
	public double getArea()
	{
		return sideA * sideB;
	}
}