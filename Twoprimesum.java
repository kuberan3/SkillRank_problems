import java.lang.*;
import java.util.Scanner;
class Twoprimesum
{
	public static void main(String args[])
	{
		int n,k,count,count1,j,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			count=0;count1=0;
			for(j=2 && k=2;j<n && k<n;j++ && k++)
			{
				if(j%i==0)
					count++;
				if(k%i==0)
					count1++;
			}
			if(count==2 && count1==2)
			{
				if((k+j)==n)
				{
					System.out.print(j);
					System.out.print(k);
				}
			}
		}
	}	
}