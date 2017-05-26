import java.util.Scanner;

/**
 * A simple class to run the MagpieP2 class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunnerP2
{

	
	public static void main(String[] args)
	{
		MagpieP2 maggie = new MagpieP2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}