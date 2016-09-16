import java.util.Scanner; //import Statemnet

public class Rude_Ai
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next name that the user enters
		String name = keyboard.nextLine();
		
		//print the reuslts...
		System.out.println(name + " Damn!!!! That is a wierd name. ");
	}
}