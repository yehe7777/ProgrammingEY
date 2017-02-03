public class Human1
{
	private String hair, eyes, skin;
	
	public Human1(String h, String e, String s)
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	public Human1(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
}


