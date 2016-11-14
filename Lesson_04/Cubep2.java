import java.util.Scanner;
public class Cubep2
{
	static double side,sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter the length of the cube");
		double side = kb.nextDouble();
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa  = 6 * side * side;
	}
	public static void print()
	{
		System.out.printf("The surface area of the cube is %10.5f|n, + sa");
	}
}