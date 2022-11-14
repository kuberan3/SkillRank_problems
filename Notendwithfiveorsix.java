//square by itself if value is end with 5 or 6 don't print
import java.lang.*;
import java.util.Scanner;
class Notendwithfiveorsix
{
	public static void main(String args[])
	{
		int n,x,temp,flag=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			temp=(a[i]*a[i])+x;
			if(temp%10!=5 && temp%10!=6)
			{
				flag=1;
				System.out.print(temp+" ");
			}
		}
		if(flag==0)
			System.out.println("-1");
	}
}