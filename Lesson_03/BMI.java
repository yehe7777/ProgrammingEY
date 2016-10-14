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

		
		

		double BMI =  ((weight * 703)/(height * height));
        System.out.printf("Your BMI is %10.4fs\n", BMI);
		 System.out.println("BMI VALUES");
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5-24.9 ");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obese: 30 or over");
		
	

	}
}