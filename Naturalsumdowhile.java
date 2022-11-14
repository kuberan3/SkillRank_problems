//sum of natural number using do_while loop
import java.lang.*;
import java.util.Scanner;
class Naturalsumdowhile
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		i=1;
		do
		{
			sum=sum+i;
			i++;
		}while(i<=n);
		System.out.println("Sum of natural numbers is "+sum);
	}
}