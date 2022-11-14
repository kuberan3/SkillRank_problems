import java.lang.*;
import java.util.Scanner;
class Sort
{
	public static void main(String args[])
	{
		int n,i,j,temp,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(a[j]<a[i])
				{	
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
				break;
		}
		if(i==n-1)
			System.out.println("YES");
		else
			System.out.println("No");
	}
}