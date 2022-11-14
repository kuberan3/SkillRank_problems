//sum the digits if num is even or if num is odd then multiply the digits
import java.lang.*;
import java.util.Scanner;
class sumorproduct
{
	public static void main(String args[])
	{
		int n,sum=0,pro=1,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			temp=n;
			while(temp!=0)
			{
				sum=sum+(temp%10);
				temp=temp/10;
			}
			System.out.println(sum);
		}
		else
		{
			temp=n;
			while(temp!=0)
			{
				pro=pro*(temp%10);
				temp=temp/10;
			}
			System.out.println(pro);
		}
	}
}