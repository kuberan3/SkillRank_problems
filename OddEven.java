//odd followed by even
import java.lang.*;
import java.util.Scanner;
class OddEven
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
	}
	
}