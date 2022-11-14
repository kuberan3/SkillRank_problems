//print from last odd integers
import java.lang.*;
import java.util.Scanner;
class Printfromlastodd
{
	public static void main(String args[])
	{
		int n,i,index=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int [n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=n-1;i>=0;i--)
		{
			if(a[i]%2!=0)
			{
				index=i;
				break;
			}
		}
		for(int j=index;j>=0;j--)
			System.out.print(a[j]+" ");
	}
}