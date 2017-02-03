public class MilesPerHour {
	private int distance;
	private int hours, minutes;
	private double mph;

	public MilesPerHour() {
		setValues(0, 0, 0);
	}

	public MilesPerHour(int dist, int hrs, int mins) {
		setValues(dist, hrs, mins);
	}

	public void setValues(int dist, int hrs, int mins) {
		this.distance = dist;
		this.hours = hrs;
		this.minutes = mins;
		this.mph = 0;
	}

	public double getMPH() {
		this.mph = distance / ((double) hours + minutes / 60.0);
		return mph;
	}

	@Override
	public String toString() {
		return String.format("%s miles in %s hours and %s minutes = %.3f mph", distance, hours, minutes, this.getMPH());
	}
}
