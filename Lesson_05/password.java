import java.util.Scanner;
public class password
{
	static String username,password;
	public static void main(String[]args)
	{
		passCheck();
	}
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your username:");
		username = kb.nextLine();
		System.out.println("Please enter your password:");
		password = kb.nextLine();
		if (username.equals("hobo")&&password.equals("hobo"))
		{
			System.out.println("Access Granted");
		}
		else if (!username.equals("hobo5")&&password.equals("hobo5"))
		{
			System.out.println("Username is incorrect\n");
			passCheck();
		}	
		else if (username.equals("hobo")&&!password.equals("hobo"))
		{
			System.out.println("Password is incorrect\n");
			passCheck();
		}	
		else if (!username.equals("hobo")&&!password.equals("hobo"))
		{
			System.out.println("Otherwise both the username and passsword are incorrect\n");
			passCheck();
		}
	}
}