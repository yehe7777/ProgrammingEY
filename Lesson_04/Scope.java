import java.util.Scanner;
public class Scope
{
	static String var1 = "Your numbers are......";
	static int var2;
	static double var3;
	

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		  var2 = kb.nextInt();
		System.out.println("Please enter a double:");
		 var3 = kb.nextDouble();
		method1();
	}
	
	public static void method1()
	{
		System.out.println(var1 + var2 + " and" + var3 + ".");
	}

	
}