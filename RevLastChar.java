//Reverse last x characters
import java.lang.*;
import java.util.Scanner;
class RevLastChar
{
	public static void main(String args[])
	{
		String s;
		int x,i;
		Scanner p=new Scanner(System.in);
		s=p.next();
		x=p.nextInt();
		for(i=0;i<s.length()-x;i++)
			System.out.print(s.charAt(i));
		for(i=s.length()-1;i>=s.length()-x;i--)
			System.out.print(s.charAt(i));
	}
}