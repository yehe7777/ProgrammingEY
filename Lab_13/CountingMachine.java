import java.util.ArrayList;

public class CountingMachine
{
	public static void main(String[]args) {
	ArrayList<Money> inventory = new ArrayList<Money>();
	inventory.add(new Coin("Penny", 2.5, 00.01));
	inventory.add(new Coin("Nickel", 5.0, 00.05));
	inventory.add(new Coin("Dime", 2.268, 00.10));
	inventory.add(new Coin("Quarter", 5.670, 00.25));
	inventory.add(new Bill("One", "Washington", 01.00));
	inventory.add(new Bill("five", "Lincoln", 05.00));
	inventory.add(new Bill("Ten", "Hamilton", 10.00));
	inventory.add(new Bill("Twenty", "Jackson", 20.00));
	inventory.add(new Bill(" Hundred", "Franklin", 100.00));
	
	for(Money x : inventory)
 	  {
		System.out.println(x);
	  }
	}

	
}