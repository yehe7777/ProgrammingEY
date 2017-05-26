public class PC extends GameSystems
{
	public PC()
	{
		super();
	}
	
	public PC(String a)
	{
		super(a);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNum() + "\nSystem Input: " + systemInput();
	}
}