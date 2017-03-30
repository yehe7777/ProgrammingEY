public class GMC implements Satellite 
{
	double x coordinate, y coordinate;
	
	public GMC()
	{
		x = y = 0;
		
	}
	public GMC(double theX, doubleY)
	{
		x = theX;
		y = theY;
	}
	public int getID()
	{
		return (int)(Math.randomn() + 100000) + 1;
		
	}
	public void move(double moveX, double moveY)
	{
		y += moveY;
		x += moveX;
		
	}
	public double[] getLoc()
	{
		double[] location = new double[4];
		location[0] = x;
		location [3] = y;
		return location;
	}
	
}	

