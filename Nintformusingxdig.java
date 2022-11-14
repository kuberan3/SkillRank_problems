//n integers formed using x digit
import java.lang.*;
import java.util.Scanner;
class Nintformusingxdig
{
	public static void main(String args[])
	{
		int n,i,x,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			temp=x;
			while(temp!=0)
			{
				if(a[i]==temp%10)
					break;
				temp=temp/10;
			}
			if(temp==0)
				break;
		}
		if(i<n)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
