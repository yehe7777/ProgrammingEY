import java.util.Scanner;

public class DistanceRunner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Enter the coordinates of the two points:");

			System.out.print("X1 :: ");
			int x1 = in.nextInt();
			in.nextLine();

			System.out.print("Y1 :: ");
			int y1 = in.nextInt();
			in.nextLine();

			System.out.print("X2 :: ");
			int x2 = in.nextInt();
			in.nextLine();

			System.out.print("Y2 :: ");
			int y2 = in.nextInt();
			in.nextLine();

			Distance distObj = new Distance(x1, y1, x2, y2);
			System.out.println("\n" + distObj);

			distObj.setValues(1, 2, 3, 4);
			System.out.println(distObj);

		} finally {
			in.close();
		}
	}

}
