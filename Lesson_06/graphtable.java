import java.util.Scanner;
public class graphtable
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an intger");
		int intger = kb.nextInt();
		System.out.println("Enter the shape of the table:");
		int shape = kb.nextInt();
		for (int i = 1; i <= shape; i++)
		{
			System.out.printf("%3d : %5d\n", i, intger);
		}
	}
}


