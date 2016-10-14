import java.util.Scanner;
public class Compund_interest
{
	public static void main(String[]args)
	{
		Compund_interest total = new Compund_interest();
		Scanner kb = new Scanner(System.in);
		
		
	  System.out.println("Enter your principal :"); 
 		double principal = kb.nextDouble(); 
		System.out.println("Enter the interest rate in percentage:"); 
	    double rate = kb.nextDouble(); 
		System.out.println("Enter the number of times the interest is compounded:"); 
		double number = kb.nextDouble(); 
		System.out.println("Enter the  number  of  times the load is compounded per year:"); 
		double  = kb.nextDouble(principal, rate, number, years); 
 		System.out.printf("Your total payment is \n%10.3f", + Compund_interest.formula(principal, rate, number, years)); 
 	} 
 	 
 	public double Compound_interest(double principal, double rate, double number, double years) 
 	{
		 return Math.pow(Principal(1 + rate/ number ),(number * years));