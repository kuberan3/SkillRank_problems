//star pattern1
/*  1
	1 2
	1 2 3 */
import java.lang.*;
import java.util.Scanner;
class Pattern1
{
	public static void main(String args[])
	{
		int row;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}