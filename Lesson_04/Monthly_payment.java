import java.util.Scanner;
public class Monthly_payment
{
	public static void main(String[]args)
	{
	
		Monthly_payment total = new Monthly_payment();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the principal amount you intend to borrow:");
        double principal = kb.nextDouble();
		System.out.println("Enter the interest rate in US dollars:");
		double rate = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compounded per year:");
		double number = kb.nextDouble();
		System.out.println("Enter the life of the loan in years");
		double years = kb.nextDouble(principal, rate, number, years);
		System.out.printf("Your total payment is %10.2f\n", + Monthly_payment.formula(principal, rate, number, years)); 

		
		
		
		
	}
	public double Monthly_payment(double rate, double principal, double number, double years)
	{
		return Math.pow(Principal(1 + rate / number), (years * number));
	}
}