//prevois k integer 
import java.lang.*;
import java.util.Scanner;
class Prekint
{
	public static void main(String args[])
	{
		int n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=n-k;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}