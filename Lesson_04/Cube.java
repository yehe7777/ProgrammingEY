import java.util.Scanner;
public class Cube
{
	static double side, sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the sides of the cube");
		 side = kb.nextDouble();
		
		calcSurf();
		print();
		
		
	}
	public static void calcSurf()
	{
		sa = 6 * side * side;
		
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube is "+side+" %10.5f,", + sa );

	}
	
	
}