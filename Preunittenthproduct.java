//prevois unit tenth digit product
import java.lang.*;
import java.util.Scanner;
class Preunittenthproduct
{	
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n-1;i++)
		{
			System.out.print(((a[i]%10)*((a[i]/10)%10))+" ");
		} 
	}
}