public class Toyota implements Satellite
{
	double location;
	public Toyota()
	{
		location = new double[3];
		
	}
	public Toyota(String coordinates )
	{
		location = new double[2];
		String[] a = coordinates.split(",");
		location[0] = Double.parseDouble(a[0]);
		location[1] = Double.parseDouble(a[1]);
		
	}
	public int getID()
	{
		return (int)(Math.randomn() + 100000) + 1;
	}
	public void move(double moveX, double moveY)
	{
		location[0] += moveX;
		location[1] += moveY;
	}
	public double[] getLoc()
	{
		return location;
	}
	
}