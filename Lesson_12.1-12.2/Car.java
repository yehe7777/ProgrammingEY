import java.util.Scanner;

public class Car {
	private String paint, interior, engine, tires;

	public Car() {
		setCustom("", "", "", "");
	}

	public Car(String p, String i, String e, String t) {
		setCustom(p, i, e, t);
	}

	public void setCustom(String p, String i, String e, String t) {
		this.paint = p;
		this.interior = i;
		this.engine = e;
		this.tires = t;
	}

	public String getPaint() {
		return paint;
	}

	public String getInterior() {
		return interior;
	}

	public String getEngine() {
		return engine;
	}

	public String getTires() {
		return tires;
	}

}

