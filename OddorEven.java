//odd or even - 1 or 2
import java.lang.*;
import java.util.Scanner;
class OddorEven
{
	public static void main(String args[])
	{
		int n,temp,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[20];
		temp=n;i=0;
		while(temp!=0)
		{
			a[i]=temp%10;
			temp=temp/10;
			i++;
		}
		for(j=i-1;j>=0;j--)
		{
			if(a[j]%2==0)
				System.out.print(1);
			else
				System.out.print(2);
		}
	}
}