import java.util.Scanner;

public class MPH_Runner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Enter the distance (in miles) :: ");
			int dist = in.nextInt();
			in.nextLine();

			System.out.print("Enter the time it takes to travel the path:\nHours :: ");
			int hrs = in.nextInt();
			in.nextLine();

			System.out.print("Minutes :: ");
			int mins = in.nextInt();
			in.nextLine();

			MilesPerHour mphObj = new MilesPerHour(dist, hrs, mins);

			// Test 1
			System.out.println("\n" + mphObj);

			// Test 2
			mphObj.setValues(9, 1, 30);
			System.out.println(mphObj);
		} finally {
			in.close();
		}
	}
}

