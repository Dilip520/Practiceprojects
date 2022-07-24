package filehandlings;
import java.io.FileWriter;   
import java.io.IOException; 
public class Filewrite
{
	  public static void main(String[] args) 
	  {
	    try 
	    {
	      FileWriter myWriter = new FileWriter("sample.txt");
	      myWriter.write("Files can be written easily");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e)
	    {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
}

