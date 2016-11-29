import java.util.Scanner;
public class Lesson_09
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
			
		}
		for(int num : numbers)
			System.out.println(num);
		
		System.out.println("the sum of the numbers above is ...." + sumArray(numbers));
	
	}
	
	public static int sumArray(int[] n)
	{
		int sum = 0;
		for(int num : n)
		{
			sum += num;
			
		}	
		return sum;
	}
  
}