import java.util.Scanner;
public class Recieptp2
{
	static double Recieptp2; 
	static String item1, item2, item3, item4;
	static double price1, price2, price3, price4, Subtotal,tax,Total;
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Enter item 1: ");
	item1 = kb.nextLine();
	
	System.out.println("Enter price of item 1: ");
	price1 = kb.nextDouble();
	
	System.out.println("Enter item 2: ");
	kb.nextLine();
	item2 = kb.nextLine();
	
	System.out.println("Enter price of item 2: ");
	price2 = kb.nextDouble();
	
	System.out.println("Enter item 3: ");
	kb.nextLine();
	item3 = kb.nextLine();
	
	System.out.println("Enter price of item 3: ");
	price3 = kb.nextDouble();
	
	System.out.println("Enter item 4: ");
	kb.nextLine();
	item4 = kb.nextLine();
	
	System.out.println("Enter price of item 4: ");
	price4 = kb.nextDouble();
	
	Subtotal = price1 + price2 + price3 +price4;
	
	
	
	tax = .085*(Subtotal-Recieptp2);
	Total = Subtotal-Recieptp2+tax;
	
	print();
	}
	public static void discount(double Subtotal)
	{
		if (Subtotal>= 2000)
			Recieptp2 = .15*Subtotal;
		if (Subtotal< 2000)
			Recieptp2 = 0;
	}
	public static void print()
	{
		System.out.println("<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		System.out.printf("*  %15s ........ %10.2f", item1, price1);
		System.out.printf("\n*  %15s ........ %10.2f", item2, price2);
		System.out.printf("\n*  %15s ........ %10.2f", item3, price3);
		System.out.printf("\n*  %15s ........ %10.2f", item4, price4);
		System.out.printf("\n\n*  %15s ........ %10.2f", "Subtotal:", Subtotal);
		System.out.printf("\n*  %15s ........ %10.2f", "Recieptp2:", Recieptp2);
		System.out.printf("\n*  %15s ........ %10.2f", "Tax:", tax);
		System.out.printf("\n*  %15s ........ %10.2f", "Total:", Total);
		System.out.println("\n_______________________________________________\n\t* Thank you for your order *");
	}
}