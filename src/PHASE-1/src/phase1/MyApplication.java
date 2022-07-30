package phase1;
import java.io.File;
import java.util.Scanner;
public class MyApplication 
{
			public static void details()
			{
				System.out.println("....Welcome to VirtualRepository.....");
				System.out.println("This application is developed by :");
				System.out.println("\t\t\t\t -DIlip");
				System.out.println("<-------------------------------------------->");
			}
			public static void main(String[] args)
			{
				MyApplication.details();
				Scanner sn=new Scanner(System.in);
				System.out.println("Enter the path or copy the location where to create a directory ");
				String path=sn.next();
				System.out.println("Enter the Directory name where to store files ");
				String dir=sn.next();
				path=path+"/"+dir;
				File f=new File(path);
				if(f.mkdir())
				{
					System.out.println("Directory created");
				}
				else 
				{
					System.out.println("Directory already exists");
				}
				while(true)
				{
					System.out.println("--------------Main menu --------------------");
					System.out.println("1. Display in ascending order \n2. Business level operations  \n3.Close the Application");
					System.out.println("Enter Your Choice : ");
					int choice=sn.nextInt();
					switch(choice) 
					{
					      case 1 : RetriveFilesAscendingOrder as=new RetriveFilesAscendingOrder();
					                  as.ascendingorder(path);
					    	          break;
					      case 2 : BusinessLevelRequirement br=new BusinessLevelRequirement();
					                  br.Menuoperations(path+"/");
					    	          break;
					      case 3 :System.out.println("Thank you");
					    	          System.exit(0);
					    default: System.out.println("Wrong option Entered! please enter correct option.");
							          break;
					}
				}
			}

}
	
	

