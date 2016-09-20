import java.util.Scanner; //import Statement

public class Rude_Ai
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Hi my name is RudeAi. \n I'd like to ask you a few questions.");
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next name that the user enters
		String name = keyboard.nextLine();
		
		//print the reuslts...
		System.out.println(name + " Damn!!!! That is a wierd name. ");
		
		//prompt for user input
		System.out.println("How old are you? ");
		int age= keyboard.nextInt();
		System.out.println("HAHAHAHA "+ age +" is old");
		
		//prompt for user input
		System.out.println(" What do you do for fun? ");
		String hobbie= keyboard.next();
		System.out.println (hobbie + "that is very hobo.");
		
		//prompt for user input
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println(music + " sounds terrible.");
		
		//prompt for user input
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + " siblings is just too many mouths to feed.");
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up?");
		String dream = keyboard.next();
		System.out.println(dream + " good luck you bum ");
		
	}
}