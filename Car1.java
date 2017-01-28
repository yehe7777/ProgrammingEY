public class Car1
{
	public Car1()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Car1(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
private String paint, interior, engine, tires;
	
	
	
	void Custom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
}

