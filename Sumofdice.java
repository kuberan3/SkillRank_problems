//sum of dice 
import java.lang.*;
import java.util.Scanner;
class Sumofdice 
{
	public static void main(String args[])
	{
		int a[]=new int[6];
		int b[]=new int[6];
		int i,j,sum=0;
		Scanner s=new Scanner(System.in);
		for(i=0;i<6;i++)
		{
			a[i]=s.nextInt();
			b[i]=s.nextInt();
			if(a[i]!=b[i])
			{
				break;
			}
		}
		for(j=0;j<=i;j++)
		{	
			sum=sum+(a[j]+b[j]);
		}
		System.out.println(sum);
	}
}