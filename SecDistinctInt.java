//second distinct integer
import java.lang.*;
import java.util.Scanner;
class SecDistinctInt
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.print(a[i+1]);
				break;
			}
		}
	}
}