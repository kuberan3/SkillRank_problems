//sum of natural numbers
import java.lang.*;
import java.util.Scanner;
class Naturalsum
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers is "+sum);
	}
}