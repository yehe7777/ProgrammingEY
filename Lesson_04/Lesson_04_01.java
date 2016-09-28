public class Lesson_04
{
	public static void main(String[]args)
	{
		System.out.printf("%10s   %10.2f",  "test", 564.3453);
		System.out.printf("\n%10s 909878", "thisexam");
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaah";
		double number1= 564.3453;
		
		form.format(word1, number1);
		String word2 = "yessssss";
		double number2 = 564.3453;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}