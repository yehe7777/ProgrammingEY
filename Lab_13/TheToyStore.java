
import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore <toyList, Toy>
{
	ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String list)
	{
		loadToys(list);
	}
	
	@SuppressWarnings("unchecked")
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			if (t == null)
			{
				if (type.equals("Car"))
					toyList.add((Toy) new Car(name));
				if (type.equals("AF"))
					toyList.add((Toy) new AF(name));
			}
			else
			{
				((TheToyClass) t).setCount(((TheToyClass) t).getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for (Toy t : toyList)
		{
			if (((TheToyClass) t).getName().equals(nm))
				return t;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy t : toyList)
		{
			if (max < ((TheToyClass) t).getCount())
			{
				max = ((TheToyClass) t).getCount();
				name = ((TheToyClass) t).getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for (Toy t : toyList)
		{
			if (((Car) t).getType().equals("Car"))
				cars += 1;
			if (((Car) t).getType().equals("Action Figure"))
				figures +=1;
		}
		
		if (cars>figures)
		{
			return "Cars";
		}
		if (figures>cars)
		{
			return "  Action Figures";
		}
		return "It will equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return "" + toyList;
	}
}
public class AF {

	public AF(String name) {
		// TODO Auto-generated constructor stub
	}

}


	
	
