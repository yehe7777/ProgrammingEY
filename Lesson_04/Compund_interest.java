import java.util.Scanner;
public class Compund_interest
{
	public static void main(String[]args)
	{
		Compund_interest total = new Compund_interest();
		Scanner kb = new Scanner(System.in);
		
		
	  System.out.println("Enter your principal in dollars:"); 
 		double principal = keyboard.nextDouble(); 
		System.out.println("Enter the interest rate :"); 
	    double rate = keyboard.nextDouble(); 
		System.out.println("Enter the number of times the interest is compounded yearly:"); 
		double number = keyboard.nextDouble(); 
		System.out.println("Enter the life of the loan in years:"); 
		double years = keyboard.nextDouble(); 
 		System.out.println("Your total payment is: \n$" + Compund_interest.formula(principal, rate, number, years)); 
 	} 
 	 
 	public double Compund_interest(double principal, double rate, double number, double years) 
 	{ 
 		 		return (("Math.pow(1+(rate/number),(principal*years)/(12*time)"); 

	  
	}  
	  
 		
		
	 
 	 

}