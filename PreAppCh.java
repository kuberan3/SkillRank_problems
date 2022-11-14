//prepand anfd append character
import java.lang.*;
import java.util.Scanner;
class PreAppCh
{
	public static void main(String args[])
	{
		String s;
		char ch;
		int i;
		Scanner p=new Scanner(System.in);
		s=p.next();
		ch=p.next().charAt(0);
		if(ch!=s.charAt(0))
			System.out.print(ch);
		for(i=0;i<s.length();i++)
			System.out.print(s.charAt(i));
		if(ch!=s.charAt(s.length()-1))
			System.out.print(ch);
	}
}