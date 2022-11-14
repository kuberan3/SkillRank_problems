//Middle integers within range
import java.lang.*;
import java.util.Scanner;
class Miditnwithinrange
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=1;i<n-1;i++)
		{
			if(a[i]<a[0] || a[i]>a[n-1])
				break;
		}
		if(i<n-1)
			System.out.print("NO");
		else
			System.out.print("YES");
	}
}