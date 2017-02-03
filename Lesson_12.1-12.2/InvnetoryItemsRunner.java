import java.util.Scanner;

public class InvnetoryItemsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the item manufacturer:");
		String manufacturer = kb.next();
		
		System.out.println("Enter the item name:");
		String name = kb.next();
		
		System.out.println("Do you have a need service today?");
		String choice = kb.next();
		if(choice.equals("no"))
		{
			Inventory object = new Inventory(manufacturer, name, choice, 0);
			System.out.println(object);
		}
		if(choice.equals("yes"))
		{
			System.out.println("Enter a category:");
			String category = kb.next();
			System.out.println("Enter a price:");
			int price = kb.nextInt();
			Inventory object1 = new Inventory(manufacturer, name, category, price);
			System.out.println(object1);
		}
	}
}
