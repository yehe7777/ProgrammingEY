import java.util.Scanner;
public class ToyStoreRunner
{
	public static < TheToyStore> void main(String[]args)
	{
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		System.out.println("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		String list kb.nextLine();
		@SuppressWarnings("rawtypes")
		ToyStore = new ToyStore(list);
		System.out.println(store);
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}