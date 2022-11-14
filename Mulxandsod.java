//product of x and sum of digits
import java.lang.*;
import java.util.Scanner;
class Mulxandsod
{
	public static void main(String args[])
	{
		int n,x,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x=s.nextInt();
		for(int temp=n;temp!=0;temp=temp/10)
		{
			sum=sum+(temp%10);
		}
		System.out.println(sum*x);
	}
}