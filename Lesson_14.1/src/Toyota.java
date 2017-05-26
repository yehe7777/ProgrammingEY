public class Toyota extends Car
{
	public Toyota(String coords){
	  String[] c = coords.split(", ");
		for(int i = 0; i < 2; i++){
		location[i] = Double.parseDouble(c[i]);
		}
	}
}