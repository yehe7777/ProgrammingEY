import java.util.Scanner;

public class Compound_Interest
{
	public static void main(String[]args)
	{
		Compound_Interest total = new Compound_Interest();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter interest rate:");
		double rate = kb.nextDouble();
		System.out.println("Enter the original amount borrowed:");
		double principle = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compounded in a year:");
		double compounded = kb.nextDouble();
		System.out.println("Enter the time of loan in years:");
		double time = kb.nextDouble();
		double total_pay = total.Total_Pay( rate, principle, compounded, time);
		System.out.printf("The total pay per month is \n%10.2f", total_pay);
	}
	public double Total_Pay(double rate, double principle, double compounded, double time)
	{
		return ((principle*Math.pow(1+(rate/compounded),compounded*time))/(12.0 *time));
	}
}