import java.util.Scanner;
public class Lesson_lab
{
	public static void main(String[]args)
	{
		Lesson_lab form = new Lesson_lab();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		double subtotal = price1 + price2 + price3;
		double tax = .087 * subtotal;
		double total = subtotal + tax;
		
		form.receipt(item1, price1, item2, price2, item3, price3, subtotal, tax, total);
		
	}
	
	public void receipt(String item1, double price1, String item2, double price2, String item3, double price3, double subtotal, double tax, double total)
	{
		System.out.println("<<<<<<<<<__Receipt__>>>>>>>>>>");
		System.out.printf("*  %15s  %10.2f", item1, price1);
		System.out.printf("\n %15s  %10.2f", item2, price2);
		System.out.printf("\n  %15s  %10.2f", item3, price3);
		System.out.printf("\n\n  %15s  %10.2f", "Subtotal:", subtotal);
		System.out.printf("\n %15s %10.2f", "Tax:", tax);
		System.out.printf("\n  %15s  %10.2f", "Total:", total);
		System.out.println("\n_________________________________________\\n\t* Thank you for your order *");
	}
		
		
		
		
	

}