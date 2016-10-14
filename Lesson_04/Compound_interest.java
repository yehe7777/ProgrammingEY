import java.util.Scanner;
public class Compound_interest
{
	public static void main(String[]args)
	{
		Compound_interest compound = new Compound_interest();
		Scanner kb = new Scanner(System.in);
		
		
	  System.out.println("Enter your principle in special currency:"); 
 		double principle = kb.nextDouble(); 
		System.out.println("Enter the interest rate :"); 
	    double rate = kb.nextDouble(); 
		System.out.println("Enter the number of times the interest is compounded yearly:"); 
		double number = kb.nextDouble(); 
		System.out.println("Enter the life of the loan in years:"); 
		double years = kb.nextDouble();
		double compound_interest = compound.Compound_interest(principle, rate, number, years);
		System.out.printf("Your total payment is %10.2f\n", + compound_interest); 
 	} 
 	 
 	public double Compound_interest(double principle, double rate, double number, double years) 
 	{
		return ((principle*Math.pow(1+(rate/number),(number*years));
	} 
 		 		

	  
	  
	  
 		
		
	 
 	 

}