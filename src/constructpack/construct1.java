package constructpack;

public class construct1
{
String emply;
	 int eid;
	 //passing no arguments
	 construct1()
	 {
		 emply="ram";
		eid=5;
	 }
	 //parameterized constructors
	 construct1(String emply,int eid)
	 {
	   this.emply=emply;
	    this.eid=eid;
	 }
	void display()
	{
		System.out.println("his name is:"+emply);
		System.out.println("his id is: "+eid);
	}
}
