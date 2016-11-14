import java.util.Scanner;
public class averagep2
{
	static double num1, num2, num3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter numeral 1");
		 num1 = kb.nextDouble();
		System.out.println("Enter numeral 2");
		 num2 = kb.nextDouble();
		System.out.println("Enter numeral 3");
		 num3 = kb.nextDouble();
		print(average(num1,num2,num3));

		
		
	}
	public static double average(double num1,double num2, double num3)
	{
		return (num1 + num2 + num3 )/ 3;
		
	}
	public static void print(double averagep2)
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is %10.5f .", + averagep2);

	}
}