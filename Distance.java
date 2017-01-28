public class Distance 

{	public static void main(String[]args)
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {
		this.setValues(0, 0, 0, 0);
	}

	public Distance(int x1, int y1, int x2, int y2) {
		this.setValues(x1, y1, x2, y2);
	}

	public void setValues(int x1, int y1, int x2, int y2) {
		this.xOne = x1;
		this.yOne = y1;
		this.xTwo = x2;
		this.yTwo = y2;

		this.distance = 0;
	}

	public double getDist() {
		this.distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
		return distance;
	}

	@Override
	public String toString() {
		return String.format("Distance = %.3f", this.getDist());
	}
}

