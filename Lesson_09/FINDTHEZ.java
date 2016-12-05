import java.util.Scanner;
public class FINDTHEZ
{
	static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		printArray();
		System.out.println("only " + hasZs() + " contain(s) the letter z.");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		System.out.print("For the words... ");
		for(int i = words.length - 1; i >= 0; i--)
		{
			System.out.print(words[i] + ", ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z")>=0)
				zs += word;
			else
				zs = zs;
		}
		return zs;
	}
}