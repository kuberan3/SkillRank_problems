/* star pattern2
	* * * * 
	* * *
	* *  
	*       */
import java.lang.*;
import java.util.Scanner;
class Pattern2
{
	public static void main(String args[])
	{
		int row;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(row+1)-i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}