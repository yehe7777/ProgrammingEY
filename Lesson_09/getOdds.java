public class getOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		numbers = fillArray(numbers);
		
		System.out.print("For the following numbers... [all the numbers int the array] ");
		printArray(numbers);
		System.out.print("The [getOdds()- all the odd numbers] are odd numbers ");
		getOdds(numbers);
	}
	
	public static int[] fillArray(int[] numbers)
	{
		for(int i= 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*765);
		}
		return numbers;
	}
	
	public static void getOdds(int[] numbers)
	
	{for(int number: numbers)
		{
			if (number%2 == 1){
				System.out.print(number + " ");
			}
		}
		
	}
	
	public static void printArray(int[] numbers)
	{
		
		for(int number: numbers)
		{
			System.out.print(number + " ");
		}
	}	
}