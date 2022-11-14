//mod 6 divide six
import java.lang.*;
import java.util.Scanner;
class ModsixDivsix
{
	public static void main(String args[])
	{
		int n,temp,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		temp=n;i=0;
		while(temp!=0)
		{
			a[i]=temp%6;
			temp=temp/6;
			i++;
		}
		for(j=i-1;j>=0;j--)
			System.out.print(a[j]);
	}
}