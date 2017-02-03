import java.util.Scanner;

public class HumanDriver {

	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.print("Enter hair features :: ");
		String h = kb.next();
		System.out.print("Enter eye features :: ");
		String e = kb.next();
		System.out.print("Enter skin tone  :: ");
		String s = kb.next();

		Human object = new Human(h, e, s);

		System.out.println("\nMy info...\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: "
				+ object.getSkin());

		object.setHES("dark", "light grey", "shady");

		System.out.println("\nFriend's info...\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: "
				+ object.getSkin());
	}
}
