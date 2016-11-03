import java.util.Scanner;
public class Rectangle
{
	static double length, width,  perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double length = kb.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width = kb.nextDouble();
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = (length + width)*(length+ width);
		
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %10.5f\n, ft around.",  perimeter);
	}
}