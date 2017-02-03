
public class Main {

	public static void main(String[] args) {
		int i, j;
		// i, j
		i = 13;
		// i = 13, j

		j = 3;
		// i = 13, j = 3
		int k = func(i, j);
		// i = 13, j = 3, k = -82
		i += k;
		// i = -69

		// i = 1
		// j = 3
		// k = 16
		System.out.println(String.format("i=%s\tj=%s\tk=%s", i, j, k));
	}

	private static int func(int x, int y) {
		// x = 13, y = 3
		int a = 4;
		// x = 13, y = 3, a = 4
		double b = Math.pow(y, 3);
		// x = 13, y = 3, a = 4, b = 27

		return 2 * x - a * (int) b;
	}

}





