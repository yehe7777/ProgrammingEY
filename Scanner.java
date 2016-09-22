import java.until.Scanner; //import Statment
public class Scanner
{
	public static void main(String[]args)
	{
        //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("This is a simple equation for speed .");
		 System.out.println("Please enter the distance in miles.");
		 double miles = keyboard.nextDouble();
		 double time = miles * time/24;
		 System.out.println(" The speed at this moment is " + miles + "speed.");
		 
	}
}