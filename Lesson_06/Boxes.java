import java.util.Scanner;
public class Boxes
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = kb.nextLine();
		for(int y = 0; y<word.length(); y++)
		{
			System.out.println(word);
			
		}	
	}
}
