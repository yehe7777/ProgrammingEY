import java.util.Scanner;
public class Rectanglep2
{
	static double width, length;
    public static void main(String[]args)
	{
	    Scanner kb = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle.");
		double width = kb.nextDouble();
		System.out.println("Enter the length of the rectangle.");
		double length  = kb.nextDouble();
		print (calcPerim(length, width));
		
	}
	public static double calcPerim(double width,double length)
	{
		return  2* (length + width);
	}
	public static void print(double perim)
	{
		System.out.printf("The perimeter of the rectangle is %10.5", + perim);
	}
}      