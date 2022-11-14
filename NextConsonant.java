import java.lang.*;
import java.util.Scanner;
class NextConsonant
{
	public static void main(String args[])
	{
		char ch;
		Scanner p=new Scanner(System.in);
		ch=p.next().charAt(0);
		if((char)(int)(ch+1)=='a' || (char)(int)(ch+1)=='e' || (char)(int)(ch+1)=='i' || (char)(int)(ch+1)=='o' || (char)(int)(ch+1)=='u' || (char)(int)(ch+1)=='A' || (char)(int)(ch+1)=='E' || (char)(int)(ch+1)=='I' || (char)(int)(ch+1)=='O' || (char)(int)(ch+1)=='U')
		{
			System.out.print((char)((int)ch+2));
		}
		else
			System.out.print((char)((int)ch+1));
	}
}