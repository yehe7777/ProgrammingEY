import java.util.Scanner;
public class AverageDigits
{
	static int number, digits, average;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an number");
		number = kb.nextInt();
		avgDigits();
		System.out.println("The average of the number  " + number + " is " + average);
	
		

	}
	public static void avgDigits()
	{
		number = number;
		while( number > 0)
		{
			average += number % 10;
			digits += 1;
			number /= 10;
		}	
	}
}