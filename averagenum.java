public class averagenum
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int n : numbers)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("The average of the above numbers is... " + average(numbers));
	}
	
	public static int average(int[] nums)
	{
		int sum = 0;
		int n = 0;
		for(int num : nums)
		{
			sum += num;
			n++;
		}
		return sum/(n);
	}
}