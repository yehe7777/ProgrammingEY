import java.util.Scanner;
public class CarDriver
{
	private static Scanner kb;

	public static void main (String[]args)
	{
		kb = new Scanner(System.in);
		
		System.out.println("Paint: ");
		String p = kb.next();
		System.out.println("Interior: ");
		String i = kb.next();
		System.out.println("Engine: ");
		String e = kb.next();
		System.out.println("Tires: ");
		String t = kb.next();
		
		  Car1 Car1 = new Car1(p, i, e, t);
		
		System.out.println("\nYour vehicle is ready.....\nPaint: " + Car1.getPaint() + "\nInterior: " + Car1.getInterior() + "\nEngine: " + Car1.getEngine() + "\nTires: " + Car1.getTires());
	}
}
