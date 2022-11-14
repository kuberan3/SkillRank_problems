//Mirror matrix
import java.lang.*;
import java.util.Scanner;
class Mirrormatrix
{
	public static void main(String args[])
	{
		int r,c,i,j,temp,rev;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				a[i][j]=s.nextInt();
		}
		for(i=0;i<r;i++)
		{
			for(j=c-1;j>=0;j--)
			{	
				temp=a[i][j];rev=0;
				while(temp!=0)
				{
					System.out.print(temp%10);
					temp=temp/10;
				}
				System.out.print(" ");
			}n
			System.out.println();
		}
	}
}