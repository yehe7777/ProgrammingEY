public class Car implements Location
{
	public final int ID;
	public double[] location = new double[2];
	
	public Car(){
		ID = (int)(Math.random()*1000000) ;
	}
	public int getID(){
		return ID;
	}
	public double[] getLoc(){
		return location;
	}
	public void move(double x, double y){
		location[0] += x;
		location[1] += y;
	}
}
