package phase1;

import java.io.File;
import java.util.Scanner;

class VirtualRepository{
	public static void details() {
		System.out.println("------------Application Details-------------");
		System.out.println("Project Name :LockedMe.com");
		System.out.println("This application is developed by :");
		System.out.println("ID : 253467");
		System.out.println("Name : Developer1");
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) {
		VirtualRepository.details();//shows the developer details
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path or copy the location where to create a directory ");
		String path=sc.next();
		System.out.println("Enter the Directory name where you want to store files ");
		String dir=sc.next();
		path=path+"/"+dir;
		File f=new File(path);
		if(f.mkdir()) {
			System.out.println("Directory created");
		}
		else {
			System.out.println("Directory already exists");
		}
		while(true){
			System.out.println("--------------Main menu --------------------");
			System.out.println("1. Retrive the files in ascending order \n2. Business level operations  \n3.Close the Application");	
			System.out.println("Enter Your Choice : ");
			int choice=sc.nextInt();
			switch(choice) {
			      case 1 : RetriveFileAscendingOrder rao=new RetriveFileAscendingOrder();
			                  rao.ascendingorder(path);
			    	  break;
			      case 2 : BusinessLevelRequirements blr=new BusinessLevelRequirements();
			                     blr.Menuoperations(path+"/");
			    	  break;
			      case 3 :System.out.println("Thank you...!");
			    	  System.exit(0);
			    default: System.out.println("Invalid option chosen! please choose correct option.");
					    break;
			}
		}
	}

}