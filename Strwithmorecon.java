//string with more consonants
import java.lang.*;
import java.util.Scanner;
class Strwithmorecon
{
	public static void main(String args[])
	{
		String s1,s2;
		int i,count1=0,count2=0;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s2=s.next();
		for(i=0;i<s1.length();i++)
		{
			if(!(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'))
				count1++;
		}
		for(i=0;i<s2.length();i++)
		{
			if(!(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u'))
				count2++;
		}
		if(count1>count2)
			System.out.print(s1);
		else if(count2>count1)
			System.out.print(s2);
		else	
		{
			if(s1.length()>s2.length())
				System.out.print(s1);
			else	
				System.out.print(s2);
		}
	}
}