import java.lang.*;
import java.util.Scanner;
class togglelastone
{
	static int a[]=new int[20];
	int binary(int m)
	{
		int temp,i=0;
		temp=m;
		while(temp!=0)
		{
			a[i]=temp%2;
			temp=temp/2;
			i++;
		}
		for(int j=0;j<i;j++)
		{
			if(a[j]==1)
			{
				a[j]=0;
				break;
			}
		}
		return i;
	}
	int power(int h)
	{
		int mul=2;
		if(h==0)
			mul=1;
		else
		{
			for(int j=1;j<=h;j++)
			{
				mul=mul*j;
			}
		}
		return mul;
	}
	public static void main(String args[])
	{	
		int n,i,k,m,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		togglelastone b=new togglelastone();
		i=b.binary(n);
		k=0;
		for(int j=0;j<i;j++) 
		{
			m=b.power(k);
			sum=sum+(a[j]*m);
			k++;
		}
		System.out.println(sum);
	}
}