import java.util.Scanner;
public class BMI_Part2 {
	public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	 	double weight;
	 	double height;
	 	double bmi;
	 
	 	System.out.println("Enter your weight");
		 weight = input.nextInt();
	 	
	 	System.out.println("Enter your height:");
	     height = input.nextInt();
	
	  bmi = ((weight * 703)/(height * height));
	 
	 System.out.printf("Your Bmi is %10.2f%n", bmi);
	 
	 System.out.println("BMI Vaules");
	 System.out.println("Underweight: Under 18.5");
	 System.out.println("Normal : 18.5-24.9");
	 System.out.println("Overweight: 25- 29.9");
	 System.out.println("Obese: 29.9-34.9");
	 System.out.println("Very Obese 35-39.9");
	System.out.println("Morbidly Obese 39.9"); }
	

	}
