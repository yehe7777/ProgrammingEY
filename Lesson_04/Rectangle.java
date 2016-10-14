import java.util.Scanner;
public class Rectangle

{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		double l = kb.nextDouble();
		System.out.println("Enter the width: ");
		double w = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*(l + w) );
	}
	
	public static void print()
	{
		System.out.printf("The perimeter is %10.5f <oerimeter> ft around. ", + perimeter);
	}
}