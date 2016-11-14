import java.util.Scanner;
public class Cubep2
{
	static double side,sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter the side length of the cube");
		 side = kb.nextDouble();
		print(calcSurface(side));

		
	}
	public static double calcSurface(double side)
	{
		return 6 * side * side;
	}
	public static void print(double sa)
	{
		System.out.printf("The surface area of the cube is "+ side + " %10.5fn",  sa);
	}
}