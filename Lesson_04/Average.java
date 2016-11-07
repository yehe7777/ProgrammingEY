import java.util.Scanner;
public class Average
{
	static double num1, num2, num3,  avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter numeral 1");
		 num1 = kb.nextDouble();
		System.out.println("Enter numeral 2");
		 num2 = kb.nextDouble();
		System.out.println("Enter numeral 3");
		 num3 = kb.nextDouble();
		
		
		average();
		print();
		
	}
	public static void average()
	{
		avg = (num1 + num2 + num3)/3;
		
	}
	public static void print()
	{
		System.out.printf("The average of "+ num1 +", "+ num2 +", and "+ num3 +" is %15.5f .", avg);

	}
	
}