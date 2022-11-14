//Swap alternate integers
import java.lang.*;
import java.util.Scanner;
class Swapaltint
{
	public static void main(String args[])
	{
		int n,i,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		if(n%3==0)
		{
			for(i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			for(i=0;i<n/3;i++)
			{
				temp=a[i*3];
				a[i*3]=a[(i*3)+2];
				a[(i*3)+2]=temp;
			}
			for(i=0;i<n;i++)
				System.out.print(a[i]+" ");
		}
		else 
			System.out.print("Sorry! please enter valid input");
	}
}