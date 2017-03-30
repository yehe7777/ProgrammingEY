import java.util.ArrayList;
public class CutDriver
{
	public static void main(String[]args)
	{
		ArrayList<CutShapes> cuts = new ArrayList<>();
		cuts.add(new Square(9));
		cuts.add(new Rectangle(10, 12));
		cuts.add(new Circle(5));
		
		double totalArea = 0;
		
		for(CutShapes sh : cuts)
		{
			System.out.println(sh.getArea());
		  totalArea += sh.getArea();
		}
		
		System.out.println("Total Wood Needed: " + totalArea + "Sq ft");
	}
}