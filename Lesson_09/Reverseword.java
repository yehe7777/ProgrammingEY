import java.util.Scanner;
public class Reverseword
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		for (String word : words)
		{
			System.out.print(word + ", ");
		}
		
		System.out.println();
		System.out.println("Reversed...");
		 //print the array
		 reverse(words);
	}
	
	public static void reverse(String[] w)
	{
		for(int b = w.length- 1; b >= 0; b--)
		{
			System.out.print(w[b] + " ");
		}
	}
}