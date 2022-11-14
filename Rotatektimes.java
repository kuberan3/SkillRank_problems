//Rotate k times
import java.lang.*;
import java.util.Scanner;
class Rotatektimes
{	
	public static void main(String args[])
	{
		int n,k,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=1;i<=k;i++)
		{
			temp=a[n-1];
			for(int j=n-2;j>=0;j--)
			{
				a[j+1]=a[j];
			}
			a[0]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}