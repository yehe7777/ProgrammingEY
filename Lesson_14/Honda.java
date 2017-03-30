public class Honda implements Satellite
{
	double x coordinate , y coordinate;
	public Honda()
	{
		x = y = 0;
		
	}
	public double Honda(double[] a)
	{
		x = a[0];
		y = a[1];
		
	}
	public int getID()
	{
	  return (int)(Math.randomn() + 100000) + 1;

	}
	public void move(double moveX, double moveY)
	{
		x += moveX
		y += moveY
	}
	public getLoc()
	{
		location = new double[2];
		location[0] = x;
		location[1] = y);
		return location;
	}
	
}