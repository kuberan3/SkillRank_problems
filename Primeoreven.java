//prime or even
import java.lang.*;
import java.util.Scanner;
class Primeoreven
{
	public static void main(String args[])
	{
		int n,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2 || n%2==0)
			System.out.println("VALID");
		else
			System.out.println("INVALID");
	}
}