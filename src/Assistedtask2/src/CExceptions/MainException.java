package CExceptions;

public class MainException 
{
	   public static void main(String args[])
	   {
	      try
	      {
	         throw new CustomException("This is a custom exception message");
	      } 
	      catch(CustomException e)
	      {
	         System.out.println(e);
	      }
	      finally
	      {
	    	  System.out.println("customexception are finally implemented ");
	      }
	      
	   }
}