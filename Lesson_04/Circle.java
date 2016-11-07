import java.util.Scanner;
public class Circle
{
	static double radius, area;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		 radius = kb.nextDouble();
		
		
		CalcArea();
		print();
	}
	public static void CalcArea()
	{
		area = 3.14*radius*radius;
		
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of "+radius+" remains %.5f.", area);

	}
}