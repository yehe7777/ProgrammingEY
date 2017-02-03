public class Human {
	private String hair, eyes, skin;

	public Human() {
		setHES("", "", "");
	}

	public Human(String h, String e, String s) {
		setHES(h, e, s);
	}

	public void setHES(String h, String e, String s) {
		this.hair = h;
		this.eyes = e;
		this.skin = s;
	}

	public String getHair() {
		return hair;
	}

	public String getEyes() {
		return eyes;
	}

	public String getSkin() {
		return skin;
	}
}





