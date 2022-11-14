	import java.lang.*;
	import java.util.Scanner;
	class Powerofnum
	{
		public static void main(String args[])
		{	
			int n;
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			Powerofnum p=new Powerofnum();
			System.out.println(p.power(n));
		}
		int power(int h)
		{
			int mul=2;
			if(h==0)
				mul=1;
			else
			{
				for(int j=1;j<=h;j++)
				{
					mul=mul*j;
				}
			}
			return mul;
		}
	}