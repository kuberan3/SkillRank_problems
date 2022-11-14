//valid Expression
import java.lang.*;
import java.util.Scanner;
class ValidExpression
{	
	public static void main(String args[])
	{
		String s;
		int i;
		Scanner p=new Scanner(System.in);
		s=p.next();
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				break;
		}
		if(i>=s.length()-1)
			System.out.print("Valid");
		else
			System.out.print("NotValid");
	}
}