//Two string values
import java.lang.*;
import java.util.Scanner;
class Twostring
{
	public static void main(String args[])
	{	
		int i,j;
		String s1,s2;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s2=s.next();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
			for(j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					System.out.print(s1.charAt(i));
					break;
				}
			}
		}
	}
}