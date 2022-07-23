package synchdemo;

public class Test 
{
	public static void main(String[] args)
	{
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin");

		DisplayMessage dm = new DisplayMessage();

		Thread t1 = new Thread(new Worker(dm, "hello"));
		t1.setName("t1");

		Thread t2 = new Thread(new Worker(dm, "hiiii"));
		t2.setName("t2");
		t1.start();
		t2.start();

		System.out.println(tname + ": Main method end");
	}
}
