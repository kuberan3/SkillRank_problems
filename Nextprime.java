//next prime number
import java.lang.*;
import java.util.Scanner;
class Nextprime
{	
	public static void main(String args[])
	{
		int n,count;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=n+1;;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(i);
				break;
			}
		}
	}
}