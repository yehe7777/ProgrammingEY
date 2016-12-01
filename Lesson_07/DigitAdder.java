import java.util.Scanner;
public class DigitAdder
{
	static int number, sum;
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number: ");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the thing  " + number + " is " + sum);
		
	}
	public static void sumDigits()
	{
		int num = number;
		while (num > 0)
		{
			sum +=   num%10;
			num /= 10;
		}
	}
	
}   

   