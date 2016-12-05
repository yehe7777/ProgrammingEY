public class BiggestNUmber
{
	public static int[]numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		System.out.print("For the following numbers...[sll the numbers in the array] ");
		printArray();
		System.out.print("\nTheir biggest number is [getBiggest()] " + getBiggest());
		
	}
	
	public static void fillArray()
	{
		for(int i= 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(100* Math.random());
		}
	}
	
	public static void printArray()
	{
		for(int number: numbers)
		{
			System.out.print(number + " ");
		}
	}
	
	public static int getBiggest()
	{
		int max =numbers[0];
		for(int number: numbers)
		{
			if (number > max){
				max = number;
			}
		}
		return max;
	}

}