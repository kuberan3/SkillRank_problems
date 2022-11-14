import java.lang.*;
import java.util.Scanner;
class Sample
{
	public static void main(String args[])
	{
		int n,sum=1,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n-2;i++)
		{
			System.out.print("*");
			for(j=1;j<=n-2;j++)
			{	
				System.out.print(sum);
				sum++;
			}
			System.out.print("*");
			System.out.println();
		}
	}
}