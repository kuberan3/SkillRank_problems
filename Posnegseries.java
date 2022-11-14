//positive negative series
import java.lang.*;
import java.util.Scanner;
class Posnegseries
{
	public static void main(String args[])
	{
		int n,odd=0,even=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				even=even+i;
			else
				odd=odd+i;
		}
		System.out.println(odd-even);
	}
}