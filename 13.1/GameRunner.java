public class GameRunner
{
	public static void main(String[]args)
	{
		Xbox xbox = new Xbox("XBox");
		System.out.println(xbox);
		
		PlayStation ps = new PlayStation("PlayStation 400");
		System.out.println(ps);
		
		PC pc = new PC("PC");
		System.out.println(pc);
	}
}