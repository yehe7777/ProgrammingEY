import java.util.Scanner;
public class UserName

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Enter a first name: ");
		String firstName = kb.nextLine();
		
		System.out.println("Enter a last name: ");
		String lastName = kb.nextLine();
		
		System.out.println("Would you like an avatar name?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		int answer = kb.nextInt();
		kb.nextLine();
		User object;
		if(answer == 2)
		{
			object = new User(firstName, lastName, lastName);
		}
		else
		{
			System.out.println("Enter an avatar name: ");
			String avatar = kb.nextLine();
			object = new User(firstName, lastName, avatar);
			System.out.println(object);
		}
		System.out.println(object);
	}
}