import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first word");
		String one = kb.next();
		System.out.println("Enter the second word");
		String two = kb.next();
		System.out.println("Enter the third word");
		String three = kb.next();
		makeCenter(one);
		makeCenter(two);
		makeCenter(three);
	}
	public static void makeCenter(String word)
	{
		if (word.length() >= 20)
			System.out.println(word);
		else
			makeCenter(" " + word + " ");
	}
}