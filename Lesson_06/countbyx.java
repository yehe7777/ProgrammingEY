import java.util.Scanner;
public class countbyx
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = kb.nextInt();
		System.out.println("Enter the numerical amount to be counted.");
		int count = kb.nextInt();
		for (int i = 1; i <= number/count; i++)
		{
			System.out.print(count*i + " ");
		}
		System.out.println();
	}
}