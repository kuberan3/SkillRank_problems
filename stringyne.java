//String Yes or no or equal
import java.lang.*;
import java.util.Scanner;
class stringyne
{
	public static void main(String args[])
	{
		String s;
		int i,count1=0,count2=0;
		Scanner p=new Scanner(System.in);
		s=p.next();
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='y')
				count1++;
			else 
				count2++;
		}
		if(count1>count2)
			System.out.print("Yes");
		else if(count1==count2)
			System.out.print("Equal");
		else 
			System.out.print("No");
	}
}