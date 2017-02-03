public class Inventory {
	private String manufacturer, name, category;
	private int UPC, price;

	public Inventory(String m, String n) {
		manufacturer = m;
		name = n;
		UPC = (int) (Math.random() * 1000000000) + 1;
	}

	public Inventory(String m, String n, String c, int p) {
		manufacturer = m;
		name = n;

		category = c;
		price = p;
		UPC = (int) (Math.random() * 1000000000) + 1;
	}

	public String toString() {
		return "\nInventory Items...\nItem Manufacturer: " + manufacturer + "\nItem Name: " + name + "\nItem Category: "
				+ category + "\nItem Price: " + price + "\nUPC: " + UPC;
	}
}





