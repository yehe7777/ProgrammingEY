import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class expressionsolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an equation: ");
		String expression = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		int i = 0;
		while (i < equation.size())
	
	
	{
			if (equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if (equation.get(i).equals("*"))
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				else
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			
		}
		i=0;
		while (i < equation.size())
		{
			if (equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if (equation.get(i).equals("+"))
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))+ Integer.parseInt(equation.get(i+1))));
				else
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))- Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}	
			
		}
		System.out.println(equation);
	}
}
