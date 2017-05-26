import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<>();
	public ToyStore() {}
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = this.getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));
				else if(type.equals("AF"))
					toyList.add(new AFigure(name));
			}
			else
			{
				t.setcount(t.getcount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String n)
	{
		for(Toy t : toyList)
		{
			if(t.getname().equals(n))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getmostfrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy t : toyList)
		{
			if(max < t.getcount())
			{
				max = t.getcount();
				name = t.getname();
			}
		}
		return "Most Frequent Toy: " + name;
	}
	
	public String getmostfrequentType()
	{
		int cars = 0;
		int afigures = 0;
		
		for(Toy t : toyList)
		{
			if(t.getType().equals("Car"))
			{
				cars ++;
			}
			if(t.getType().equals("Action Figure"))
			{
				afigures ++;
			}
		}
		
		if(cars > afigures)
		{
			return "Most Frequent Type of Toy: Cars";
		}
		if(afigures > cars)
		{
			return "Most Frequent Type of Toy: Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return toyList + "";
	}
}

