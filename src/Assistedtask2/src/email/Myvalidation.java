package email;
import java.util.ArrayList;
import java.util.Scanner;
public class Myvalidation
{
		public static void main(String[] args) 
		{
			ArrayList<String> emails=new ArrayList<String>();
			emails.add("Diilip@gmail.com");
			emails.add("ram@gmail.com");
			emails.add("ravi@gmail.com");
			emails.add("harsha@gmail.com");
			Scanner sc= new Scanner(System.in);
			System.out.println("enter your email");
			String id=sc.nextLine();
			if(emails.contains(id))
			{
				System.out.println("your employee emailid is successfully found\n"+id);
			}
			else
			{
				System.out.println("your employee emailid is not found");
			}
		}
	}


