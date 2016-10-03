import java.util.Scanner;
public class Boxes
{
	public static void main(String[]args)
	{
		Boxes volume = new Boxes();
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter height in inches.");
		double height = kb.nextDouble();
		System.out.println("Please enter length in inches.");
		double length = kb.nextDouble();
		System.out.println("Please enter width in inches.");
		double width = kb.nextDouble();
		double vol = volume.calcVol(height, length, width);
		System.out.printf("The volume of the Subwoofer boxes is %10.3f\n", + vol);
		
		
		
	} 
	
	public double calcVol( double height, double length, double width)
	{
		return height*length*width/728;
	}
}