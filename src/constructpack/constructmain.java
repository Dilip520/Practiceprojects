package constructpack;
import java.util.Scanner;
public class constructmain {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employ name:");
		String str=sc.nextLine();
		System.out.println("enter the id");
		int id=sc.nextInt();
		 construct1 cn= new construct1();
		 construct1 cn2= new construct1(str,id);
		  System.out.println("the emlpy details are");
		 cn.display();
		 cn2.display();    
	}
}
