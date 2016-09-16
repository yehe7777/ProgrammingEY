import java.util.Scanner; //import Statement

public class lesson_03
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your age? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome ");
		
	}
}
