 class strtostrbuf 
 {

	public static void main(String[] args)
	{
		String st1="Windows";
		//string to stringbuffer
		String str=new String("Eclipse");
           StringBuffer str1=new StringBuffer();
           str1.append(str);
           str1.reverse();
           System.out.println(str1);
           System.out.println(str);
           //string buffer to string
           String st=str1.toString();;
           System.out.println(st);
           //string builder
           StringBuilder sb=new StringBuilder(st1);
           sb.append(st1);
           System.out.println(st1);
	}

}
