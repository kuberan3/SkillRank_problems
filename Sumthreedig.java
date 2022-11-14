//sum of three digit integers
import java.lang.*;
import java.util.Scanner;
class Sumthreedig
{
	public static void main(String args[])
	{	
		int n,sum=0,count=0,temp,i,rev=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		temp=n;i=0;
		while(temp!=0)
		{
			a[i]=temp%10;
			temp=temp/10;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			if(a[i]>=0)
			{
				rev=rev*10+a[j];
				count++;
			}
			if(count==3)
			{
				sum=sum+rev;
				rev=0;count=0;
			}
		}
		System.out.println(sum);
	}
}