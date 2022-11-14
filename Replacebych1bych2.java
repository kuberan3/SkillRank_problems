//replace ch1 by ch2
import java.lang.*;
import java.util.Scanner;
class Replacebych1bych2
{
	public static void main(String args[])
	{
		String s;
		char ch1,ch2;
		int i;
		Scanner p=new Scanner(System.in);
		s=p.next();
		ch1=p.next().charAt(0);
		ch2=p.next().charAt(0);
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch1)
				System.out.print(ch2);
			else
				System.out.print(s.charAt(i));
		}
	}
}