import java.util.Random;
public class Dicegame
{
	static int player, computer;
	public static void main(String[]args)
	{
		Random random = new Random();
		computer = random.nextInt(6)+1;
		System.out.println("The computer spinned a" + computer );
		player = random.nextInt(6)+1;
		System.out.println("You flipped a " + player);
		victor();
	}
	public static void victor()
	{
		if (player<computer)
			System.out.println("The champion is the computer!");
		
	    if (player>computer)
			System.out.println("The medalist is the player!");
	
	     if (player==computer)
		System.out.println("Both of you tied !");
		
		
	}
}