import java.util.Scanner;

public class CarDriver
/**
 * object, put in parameters, and print out the information on your car. You
 * should get similar results to the following....
 * 
 * Your vehicle is ready...... Paint: red w/gold fleck Interior: Corinthian
 * leather (Brown) Engine: 5 litre v8 507hp Tires: 20" Priellis
 **/

{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {
			System.out.print("Paint :: ");
			String p = kb.next();
			System.out.print("Interior :: ");
			String i = kb.next();
			System.out.print("Engine :: ");
			String e = kb.next();
			System.out.print("Tires :: ");
			String t = kb.next();

			/* DEBUG */
			// System.out.println(String.format("%s, %s, %s, %s", p, i, e, t));

			Car car1 = new Car(p, i, e, t);

			System.out.println("\nYour vehicle is ready.....\nPaint: " + car1.getPaint() + "\nInterior: "
					+ car1.getInterior() + "\nEngine: " + car1.getEngine() + "\nTires: " + car1.getTires());

		} finally {
			kb.close();
		}
	}
}





