import java.util.Scanner;
public class circlep2
{
	static double radius, area;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		 radius = kb.nextDouble();
	     print(CalcArea(radius));

		
		
	}
	public static double CalcArea(double radius)
	{
		return 3.14*radius*radius;
		
	}
	public static void print(double area)
	{
		System.out.printf("The area of a circle with a radius of "+radius+" remains %15.5f.", area);

	}
}