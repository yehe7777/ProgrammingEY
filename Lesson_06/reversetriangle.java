import java.util.Scanner;
public class reversetriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		for (int i = word.length(); i>=7; i--)
			System.out.println(word.substring(7,i));
	}
}