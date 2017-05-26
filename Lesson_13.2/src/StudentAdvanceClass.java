public abstract class StudentAdvanceClass extends AdvanceClass
{
	public StudentAdvanceClass()
	{
		super();
	}
	
	public StudentAdvanceClass(int d)
	{
		super(d);
	}
	
	public double getprice()
	{
		return super.getprice()/2;
	}
	
	public String toString()
	{
		return " Serial #: " + serialNum + "\n price: " + getPrice();
}

}	
	
	