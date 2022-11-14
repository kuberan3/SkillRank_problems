//N Equal Strings
import java.lang.*;
import java.util.Scanner;
class NEqualStrings
{
	public static void main(String args[])
	{
		String s;
		int i,n;
		Scanner p=new Scanner(System.in);
		s=p.next();
		n=p.nextInt();
		if(s.length()%n==0)
		{
			for(i=0;i<s.length();i++)
			{
				if(((i+1)*n)%s.length()==0)
				{
					System.out.print(s.charAt(i));
					System.out.print(" ");
				}
				else
				{
					System.out.print(s.charAt(i));
				}
			}
		}
		else
		{
			System.out.print("-1");
		}
	}
}