package phase1;
import java.io.File;
import java.util.Scanner;
class RetriveFileAscendingOrder
	{
	   public void ascendingorder(String path) 
	      {
			File fr=new File(path);
			String listoffiles[]=fr.list();
			if(listoffiles.length==0) 
			{  
	     	  System.out.println("No files exists in  directory");
			}
			else 
			{
		      System.out.println("List of files in directory");
				 for(String str :listoffiles) 
				 {
				   System.out.println(str);
			     }
			}
	      }
	}

	 class BusinessLevelRequirements
	 {
	       public void creatingfile(String str) 
	       {
			File myfile=new File(str+".txt");
			try 
			{
				if(myfile.createNewFile())
				{       
					System.out.println("our new file is successfully added to directory ");
				}
				else
				{
					System.out.println("Already file exists in directory");
				}
			} catch (Exception e) 
			{	
				e.printStackTrace();
			}
		}
	        public void deletingfile(String str) 
	        {
			File myfile=new File(str+".txt");
			try
			{
				if(myfile.delete()) 
				{   
					System.out.println("File successfully deleted from directory ");
				}
				else
				{
					System.out.println(" File does not Exists");
				}
			} 
			catch (Exception e) 
			 {
			   e.printStackTrace();
			 }
		}
	        public void searchingfile(String str)
	        {
			File myfile=new File(str+".txt");
			try 
			 {
				if(myfile.exists()) 
				{
					System.out.println(str+" file exists");
				}
				else 
				{
					System.out.println(str+" file does not exists ");
				}
				
			  }
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		
		public void  Menuoperations(String path)
		{
			Scanner sn=new Scanner(System.in);
			System.out.println(".. Business level Operations.. ");
			while(true) 
			{
				
				System.out.println("1. Add a file \n2. Delete a file  \n3.Search a file \n4.Return to main menu");
				System.out.println("\nEnter your choice : ");
				int choice=sn.nextInt();
				switch(choice)
				{
				    case 1:System.out.println("Enter file name to be added : ");
				       String str=sn.next();
				       BusinessLevelRequirements af=new BusinessLevelRequirements();
				       af.creatingfile(path+str);
				    	break;
				    case 2:System.out.println("Enter file name to be Deleted : ");
				       String str1=sn.next();
				        BusinessLevelRequirements df=new  BusinessLevelRequirements();
				       df.deletingfile(path+str1);
				    	break;
				    case 3:System.out.println("Enter file name to be searched : ");
				       String str2=sn.next();
				        BusinessLevelRequirements sf=new  BusinessLevelRequirements();
				       sf.searchingfile(path+str2);
				    	break;
				    case 4:
				    	System.out.println("Return back to main menu.");
				    	return;
				    default:System.out.println("Invalid option chosen! please choose correct option.");
				    break;
				}
			}
		}

	}


