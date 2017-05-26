
public abstract class Console extends GameSystems
{
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	
	public String toString()
	{
		return String.format("Platform:\t\t" + super.getPlatform() + "\nSerial Number:\t" + getSerialNum() + "\nController:\t\t" + getController());
	}
}