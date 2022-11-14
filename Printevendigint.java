//print event digit integer
import java.lang.*;
import java.util.Scanner;
class Printevendigint
{
	public static void main(String args[])
	{
		int n,i,temp,flag=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			temp=a[i];
			while(temp!=0)
			{
				if((temp%10)%2!=0)
					break;
				temp=temp/10;
			}
			if(temp==0)
			{
				flag=1;
				System.out.print(a[i]+" ");
			}
		}
		if(flag==0)
			System.out.println("-1");
	}
}