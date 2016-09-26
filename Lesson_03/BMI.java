import java.util.Scanner; //import Statement
public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This is BMI calculator. Enter your height in inches");
		double height = keyboard.nextDouble();
		System.out.println("Enter your weight in pounds");
		double weight = keyboard.nextDouble();
<<<<<<< HEAD
		double BMI = weight/ height *703;
	       System.out.println("Your BMI is " + BMI + ".");
		
=======
		double BMI =  weight/ height *703;
	       System.out.println("Your BMI is " + BMI + ".");
		
	

>>>>>>> origin/master
	}
}
