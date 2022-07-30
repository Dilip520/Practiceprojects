package phase1;
import java.io.File;
import java.util.Scanner;
class RetriveFilesAscendingOrder
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

	