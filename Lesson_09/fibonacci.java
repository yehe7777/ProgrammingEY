import java.util.Scanner;
public class fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = kb.nextInt();
		int[] sequence = new int[size];
		for(int i = 0; i < sequence.length; i++)
		{
			if(i==0 || i==1)
			{
				sequence[i] = start;
				System.out.print(sequence[i] + " ");
			}
			
			else
			{
				sequence[i] = sequence[i-2] + sequence[i-1];
				System.out.print(sequence[i] + " ");
			}
		}
	}
}