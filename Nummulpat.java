//number multiples pattren
import java.lang.*;
import java.util.Scanner;
class Nummulpat
{
	public static void main(String args[])
	{
		int rows;
		Scanner s=new Scanner(System.in);
		rows=s.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j*i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}