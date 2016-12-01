import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word ");
		String word = kb.nextLine();
		int stop = word.length();
		tree(word, 0, stop);
	}
	public static void tree(String word, int start, int stop)
	{
		if (start<=stop)
		{
			System.out.printf("%10.5s\n", word.substring(0,start));
			 tree(word, start+1, stop);
		}
	
	}
}	