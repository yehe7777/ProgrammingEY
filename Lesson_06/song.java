public class song
{
	public static void main (String[]args)
	{
		sing("Na, na , na", 4);
		sing("Hey, hey, hey, hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String lyrics, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			System.out.print(lyrics);
		}
		System.out.println();
	}
}
