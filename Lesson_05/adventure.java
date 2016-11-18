import java.util.Scanner;
public class adventure
{
	static int chance;
	static int chance2;
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are about to go on a journey. Use  1 y for yes and 2 n for no to take risks in the game.");
		System.out.println("You see food do you eat it?");


		chance = kb.nextInt();
		if(chance == 1)
		{	
			System.out.println("You find more food do you eat it?");
			chance2 = kb.nextInt();
			if(chance2 == 2)
			{
				System.out.println("You find food inside the bin do you eat it?");
				chance= kb.nextInt();
				if(chance == 1)
					System.out.println("NOthing happens.");
				else
					System.out.println("You feel hobo");
			}
			else
			{
				System.out.println("You find more food?");
				chance = kb.nextInt();
				if(chance == 1)
					System.out.println("You get sick");
				else
					System.out.println("You feel poor");
			}
		}
		else
		{	
			System.out.println("You food in a box?");
			chance = kb.nextInt();
			if(chance == 2)
			{
				System.out.println("you decide to run away from eating?");
				chance = kb.nextInt();
				if(chance == 1)
					System.out.println("You find a burger .");
				else
					System.out.println("You decide to run away.");
			}
			else
			{	
				System.out.println("You find a watch?");
				chance = kb.nextInt();
				if(chance == 1)
					System.out.println("You decide to put on the watch");
				else
					System.out.println("You get put in jail to rot for life.");
			}
		}
	}
}


