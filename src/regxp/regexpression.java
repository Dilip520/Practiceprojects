package regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexpression {
     
	public static void main(String[] args) 
	{
		int count=0;
		// TODO Auto-generated method stub
		Pattern P=Pattern.compile("hi");
		Matcher m=P.matcher("hiihellohiihellohi");
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"...."+m.end()+"..."+m.group());
		}
		System.out.println("the number of occurance:"+count);
		}

}
