public class ActionFIgure extends TheToyClass {

private String ActionFIgure; 
	
	public ActionFIgure()
	{
		super();
		String ActionFIgure = "";
		
		
	}
	public ActionFIgure(String n)
	{
		super (n);
		ActionFIgure = n;
		
	}
	public String toString()
	{ 
		return "Action Figure" + getName() + "\n"+
				super.toString();

		
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}


}
