//Multiples to beginning
import java.lang.*;
import java.util.Scanner;
class Multiplesbeg
{
	void multiplesToBeginning(int arr[],int N)
	{
		int i;
		System.out.print("Array : ");
		for(i=0;i<N;i++)
		{
			if(arr[i]%10==0)
				System.out.print(arr[i]+" ");
		}
		for(i=0;i<N;i++)
		{
			if(arr[i]%10!=0)
				System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		Multiplesbeg m=new Multiplesbeg();
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		m.multiplesToBeginning(a,n);
	}
}