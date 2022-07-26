package Subsequence;
public class LongIncresubsequence 
{
static int lisubseq(int arr[],int n)
{
	int lisubseq[]=new int[n];
	int i,j,max=0;
	for(i=0;i<n;i++)
	{
		lisubseq[i]=1;
	}
	for(i=1;i<n;i++)
	{
	for(j=0;j<i;j++)
	{
		if( arr[i]>arr[j] && lisubseq[i]<lisubseq[j]+1 )
		{
			lisubseq[i]=lisubseq[j]+1;
		}
	}	
	for(i=0;i<n;i++)
	{
		if(max<lisubseq[i])
			max=lisubseq[i];
	}
	}
	return n;
}
public static void main(String args[])
{
	int arr[]= {11,22,34,45,55,9,88};
	int n=arr.length;
	System.out.println("Length of lisubseq is:"+lisubseq(arr,n)+"\n");
}
}
