//Parallelogram pattern
import java.lang.*;
import java.util.Scanner;
class Parallelogram
{
	public static void main(String args[])
	{
		int n,i,j,m=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			
			if(i==1)
			{
				for(j=1;j<=n;j++)
					System.out.print("*");
			}
			else
			{
				for(j=1;j<i;j++)
				{
					System.out.print("-");
				}
				if(i==n)
				{
					for(j=1;j<=n;j++)
						System.out.print("*");
				}
				else
				{
					System.out.print("*");
					for(j=1;j<=n-2;j++)
					{
						System.out.print(m);
						m++;
					}
					System.out.print("*");
				}
			}			
			System.out.println();
		}
	}
}
