public class UserClass
{
	private String firstname;
	private String lastname;
	private String avatar;
	private int userID;
	
	public UserClass(String fn, String ln)
	{
		firstname = fn;
		lastname = ln;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public UserClass(String fn, String ln, String av)
	{
		firstname = fn;
		lastname = ln;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "\nCustomer Info...\nFirst Name: " + firstname +
                           "\nLast Name: " + lastname +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
}