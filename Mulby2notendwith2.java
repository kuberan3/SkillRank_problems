//multiply by 2 not end with 2
import java.lang.*;
import java.util.Scanner;
class Mulby2notendwith2
{
	public static void main(String args[])
	{
		int n,flag=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if((a[i]*2)%10!=2)
			{
				flag=1;
				System.out.print((a[i]*2)+" ");
			}
		}
		if(flag==0)
			System.out.print("-1");
	}
}