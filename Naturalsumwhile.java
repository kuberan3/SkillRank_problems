//sum of natural number using while loop
import java.lang.*;
import java.util.Scanner;
class Naturalsumwhile
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of natural numbers is "+sum);
	}
}