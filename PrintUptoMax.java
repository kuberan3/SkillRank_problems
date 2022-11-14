//print upto maximum
import java.lang.*;
import java.util.Scanner;
class PrintUptoMax
{
	public static void main(String args[])
	{
		int n,i,max,index=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		max=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
		}
		for(int j=0;j<=index;j++)
			System.out.print(a[j]+" ");
	}
}