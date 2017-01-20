import java.util.Scanner;
public class Divisor
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int[][] nums = new int[4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random()*100)+1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("Please enter a number: ");
		int divisor = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.printf("There are %d numbers divisible by %d in the array.", count, divisor);
	}
}