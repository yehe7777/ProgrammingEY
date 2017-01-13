import java.util.Scanner;
public class factorial
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number that will calculate the factorial");
		int number = kb.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++)
		{
			factorial =   i* factorial ;
		}
		System.out.println("The factorial is "+ factorial +" and " + factorial);
	}
}
