import java.util.Scanner; 
public class lab_04
{
	public static void main(String[]args)
	{
		lab_04 form = new lab_04();
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String first_name = kb.next();
		System.out.println("Enter your last name: ");
		String last_name =  kb.next();
		kb.nextLine();
		System.out.println("Enter your title: ");
		String title = kb.next();
		kb.nextLine();
		System.out.println("Enter the school site: ");
		String school_site = kb.next();
		kb.nextLine();
		System.out.println("Enter the school year: ");
		String school_year = kb.next();
		kb.nextLine();
		System.out.println("What is your subject? ");
		String subject = kb.next();
		kb.nextLine();
		
		form.lab(first_name, last_name, title, school_site, school_year, subject);
	}
	
		public void lab( String first_name,  String last_name, String title, String school_site, String  school_year, String subject)
		{
		System.out.println("  *************************************************************");
		System.out.printf("* %15s        %15s", school_site, school_year);
		System.out.printf("\n* %15s        %15s", first_name, last_name);
		System.out.printf("\n* %15s        %10s", title, subject);
		System.out.println("\n  *************************************************************");
		}
}