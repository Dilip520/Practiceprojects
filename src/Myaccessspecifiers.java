
public class Myaccessspecifiers
{
		public void publicdisplay()
		{
		System.out.println("use of public access specifier");
		}
	    private void privatedisplay()
	    {
	    	System.out.println("use of private access specifier");
	    }
	    protected void protectdisplay()
	    {
	    	System.out.println("use of protected access specifier");
	    }
	    void display()
	    {
	    	System.out.println("use of default access specifier");
	    }
	public static void main(String[] args)
		{
	      Myaccessspecifiers obj=new Myaccessspecifiers();
	      obj.publicdisplay();
	      obj.privatedisplay();
	      obj.protectdisplay();
	      obj.display();
		}
}



