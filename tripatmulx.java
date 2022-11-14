//triangle pattern multiples of x
import java.lang.*;
import java.util.Scanner;
class tripatmulx
{	
	public static void main(String args[])
	{
		int n,x,k=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x=s.nextInt();
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				if(k%x==0)
					System.out.print("*");
				else
					System.out.print(k);
				k++;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}