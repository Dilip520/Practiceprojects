
public class arrayss
{
	public static void main(String[] args) 
	{
	String[] animals = {"dog", "cat", "lion", "tiger"};
	int[][] rollno = { {501, 502, 503, 504}, {505, 506, 507} };
    for (int i = 0; i < rollno.length; ++i)
    {
      for(int j = 0; j < rollno[i].length; ++j) 
      {
        System.out.println(rollno[i][j]);
       
      }
    }
    System.out.println("the animals is:"+animals[3]);
    }
	
}