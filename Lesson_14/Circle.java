public class Circle implements CutShapes
{
	private double radius;
	
	public Circle(){
		radius = 0;
		
	}

	public Circle(double r)
	{
    radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * (Math.pow(radius, 2));
	}
	
}