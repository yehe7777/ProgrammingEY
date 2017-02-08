
public class Car extends TheToyClass
{
	
	public Car()
	{
		super();
		
		
	}
	public Car(String n)
	{
		super (n);
		
	}
	public String toString()
	{
		return "Car " + getCount() + "\n"+
			super.toString();
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
