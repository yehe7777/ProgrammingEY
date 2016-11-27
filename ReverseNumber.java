import java.util.Scanner;
public class ReverseNumber
{
	static int num;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number");
		num = kb.nextInt();
		getReverse();
		System.out.println( num + " reversed is " + rev);
	}
	public static void getReverse()
	{
		int number = num;
		while(num>0)
		{
			rev *= 10;
			rev += (num % 10);
			num/=10;
		}
	}
}